import java.util.*;

public class CarromGame {
    static final int MAX_PLAYERS = 20;
    static final int MAX_NAME_LEN = 50;

    static void processMatch(
            int playersCount,
            int[] availableCoins,
            String[] playerNames,
            String firstPlayer,
            String secondPlayer,
            List<String> moves
    ) {
        // Track white coin counts
        Map<String, Integer> whiteCount = new LinkedHashMap<>();
        for (String p : playerNames) {
            whiteCount.put(p, 0);
        }

        // Determine playing direction
        int firstIndex = -1, secondIndex = -1;
        for (int i = 0; i < playersCount; i++) {
            if (playerNames[i].equals(firstPlayer)) firstIndex = i;
            if (playerNames[i].equals(secondPlayer)) secondIndex = i;
        }
        String direction;
        int currentIndex = firstIndex;
        if ((firstIndex + 1) % playersCount == secondIndex) {
            direction = "clockwise";
        } else {
            direction = "anticlockwise";
        }

        // Process moves
        for (String move : moves) {
            String currentPlayer = playerNames[currentIndex];

            if (move.equals("end")) break;

            if (move.equals("white") && availableCoins[0] > 0) {
                availableCoins[0]--;
                whiteCount.put(currentPlayer, whiteCount.get(currentPlayer) + 1);
                continue; // extra turn
            } else if (move.equals("black") && availableCoins[1] > 0) {
                availableCoins[1]--;
                continue; // extra turn
            } else if (move.equals("red") && availableCoins[2] > 0) {
                availableCoins[2]--;
                continue; // extra turn
            } 
            // miss or foul -> pass turn

            // move to next player
            if (direction.equals("clockwise")) {
                currentIndex = (currentIndex + 1) % playersCount;
            } else {
                currentIndex = (currentIndex - 1 + playersCount) % playersCount;
            }
        }

        // Print playing direction
        System.out.println(direction);

        // Print white coin counts
        for (String p : playerNames) {
            System.out.println(p + "|" + whiteCount.get(p));
        }

        // Find winner (max white coins, tie → alphabetical order)
        int max = Collections.max(whiteCount.values());
        List<String> winners = new ArrayList<>();
        for (String p : playerNames) {
            if (whiteCount.get(p) == max) {
                winners.add(p);
            }
        }
        Collections.sort(winners);
        System.out.println("winner|" + winners.get(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playersCount = sc.nextInt();
        String[] coins = sc.next().split("\\|");
        int[] availableCoins = new int[3];
        availableCoins[0] = Integer.parseInt(coins[0]); // white
        availableCoins[1] = Integer.parseInt(coins[1]); // black
        availableCoins[2] = Integer.parseInt(coins[2]); // red

        String[] playerNames = new String[playersCount];
        for (int i = 0; i < playersCount; i++) {
            playerNames[i] = sc.next();
        }

        String[] firstLine = sc.next().split("\\|");
        String firstPlayer = firstLine[0];
        String secondPlayer = firstLine[1];

        List<String> moves = new ArrayList<>();
        while (sc.hasNext()) {
            String move = sc.next();
            moves.add(move);
            if (move.equals("end")) break;
        }

        processMatch(playersCount, availableCoins, playerNames, firstPlayer, secondPlayer, moves);

        sc.close();
    }
}