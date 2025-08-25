import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read grid dimensions
        String[] dimensions = scanner.nextLine().split("\\|");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        Grid grid = new Grid(rows, cols);

        // Read apples
        int numApples = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numApples; i++) {
            String[] appleData = scanner.nextLine().split("\\|");
            int r = Integer.parseInt(appleData[0]);
            int c = Integer.parseInt(appleData[1]);
            int hp = Integer.parseInt(appleData[2]);
            grid.setApple(r, c, hp);
        }

        // Read supporting objects
        int numSupportingObjects = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numSupportingObjects; i++) {
            String[] soData = scanner.nextLine().split("\\|");
            int r = Integer.parseInt(soData[0]);
            int c = Integer.parseInt(soData[1]);
            grid.setSupportingObject(r, c);
        }

        // Read birds
        int numBirds = Integer.parseInt(scanner.nextLine());
        List<Bird> birds = new ArrayList<>();
        int normalBirdsUsed = 0;
        int bombBirdsUsed = 0;
        int splitBirdsUsed = 0;
        int crosswingBirdsUsed = 0;

        for (int i = 0; i < numBirds; i++) {
            String[] birdData = scanner.nextLine().split(" ");
            String type = birdData[0];
            int r = Integer.parseInt(birdData[1]);
            int c = Integer.parseInt(birdData[2]);
            
            switch (type) {
                case "normal":
                    birds.add(new NormalBird(r, c));
                    break;
                case "bomb":
                    birds.add(new BombBird(r, c));
                    break;
                case "split":
                    birds.add(new SplitBird(r, c));
                    break;
                case "crosswing":
                    birds.add(new CrosswingBird(r, c));
                    break;
            }
        }
        
        // Simulation
        for (Bird bird : birds) {
            if (grid.getApples().isEmpty()) {
                break; // Game already won
            }
            if (bird instanceof NormalBird) normalBirdsUsed++;
            else if (bird instanceof BombBird) bombBirdsUsed++;
            else if (bird instanceof SplitBird) splitBirdsUsed++;
            else if (bird instanceof CrosswingBird) crosswingBirdsUsed++;

            bird.attack(grid);
        }

        // Output
        System.out.println(grid.getApples().size() + "|" + grid.getSupportingObjects().size());
        
        if (grid.getApples().isEmpty()) {
            System.out.println("Challenge cleared");
        } else {
            System.out.println("Better luck next time");
        }
        System.out.println(bombBirdsUsed + "|" + crosswingBirdsUsed + "|" + splitBirdsUsed + "|" + normalBirdsUsed);

        scanner.close();
    }
}

class Grid {
    private final int rows;
    private final int cols;
    private final Map<String, Integer> apples;
    private final Map<String, Boolean> supportingObjects;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.apples = new HashMap<>();
        this.supportingObjects = new HashMap<>();
    }

    private String key(int r, int c) {
        return r + "," + c;
    }

    public void setApple(int r, int c, int hp) {
        apples.put(key(r, c), hp);
    }

    public void setSupportingObject(int r, int c) {
        supportingObjects.put(key(r, c), true);
    }

    public Map<String, Integer> getApples() {
        return apples;
    }

    public Map<String, Boolean> getSupportingObjects() {
        return supportingObjects;
    }

    public boolean isInsideGrid(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }

    public void hitApple(int r, int c) {
        String k = key(r, c);
        if (apples.containsKey(k)) {
            int currentHP = apples.get(k);
            currentHP--;
            if (currentHP > 0) {
                apples.put(k, currentHP);
            } else {
                apples.remove(k);
            }
        }
    }

    public void hitSupportingObject(int r, int c) {
        String k = key(r, c);
        if (supportingObjects.containsKey(k)) {
            supportingObjects.remove(k);
            // Check for falling apple
            int appleRowAbove = r - 1;
            if (appleRowAbove >= 0) {
                String appleKey = key(appleRowAbove, c);
                if (apples.containsKey(appleKey)) {
                    int hp = apples.get(appleKey);
                    apples.remove(appleKey);
                    
                    int newRow = r;
                    int newHp = hp - 1;

                    if (newHp > 0) {
                        apples.put(key(newRow, c), newHp);
                    }
                }
            }
        }
    }
}

abstract class Bird {
    protected final int targetR;
    protected final int targetC;

    public Bird(int targetR, int targetC) {
        this.targetR = targetR;
        this.targetC = targetC;
    }

    public abstract void attack(Grid grid);
}

class NormalBird extends Bird {
    public NormalBird(int r, int c) {
        super(r, c);
    }

    @Override
    public void attack(Grid grid) {
        if (grid.isInsideGrid(targetR, targetC)) {
            grid.hitApple(targetR, targetC);
            grid.hitSupportingObject(targetR, targetC);
        }
    }
}

class BombBird extends Bird {
    public BombBird(int r, int c) {
        super(r, c);
    }

    @Override
    public void attack(Grid grid) {
        int[] dr = {0, 0, 0, -1, 1};
        int[] dc = {0, -1, 1, 0, 0};

        for (int i = 0; i < dr.length; i++) {
            int newR = targetR + dr[i];
            int newC = targetC + dc[i];
            if (grid.isInsideGrid(newR, newC)) {
                grid.hitApple(newR, newC);
                grid.hitSupportingObject(newR, newC);
            }
        }
    }
}

class SplitBird extends Bird {
    public SplitBird(int r, int c) {
        super(r, c);
    }

    @Override
    public void attack(Grid grid) {
        for (int i = 0; i < 3; i++) {
            int newR = targetR + i;
            if (grid.isInsideGrid(newR, targetC)) {
                grid.hitApple(newR, targetC);
                grid.hitSupportingObject(newR, targetC);
            }
        }
    }
}

class CrosswingBird extends Bird {
    public CrosswingBird(int r, int c) {
        super(r, c);
    }

    @Override
    public void attack(Grid grid) {
        int[] dr = {-1, -1, 1, 1};
        int[] dc = {-1, 1, -1, 1};

        // Attack target cell first
        if (grid.isInsideGrid(targetR, targetC)) {
            grid.hitApple(targetR, targetC);
            grid.hitSupportingObject(targetR, targetC);
        }

        // Attack diagonals
        for (int i = 1; i < Math.max(grid.getRows(), grid.getCols()); i++) {
            for (int j = 0; j < 4; j++) {
                int newR = targetR + dr[j] * i;
                int newC = targetC + dc[j] * i;
                if (grid.isInsideGrid(newR, newC)) {
                    grid.hitApple(newR, newC);
                    grid.hitSupportingObject(newR, newC);
                }
            }
        }
    }
}