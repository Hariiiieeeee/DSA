import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter vehicles: ");
        int vehicles = sc.nextInt();

        System.out.println("Enter Wheels: ");
        int wheels = sc.nextInt();

        if(wheels % 2 != 0 || wheels < 2*vehicles || wheels > 4*vehicles){
            System.out.println("Invalid Input!");
            return;
        }

        int twoWheelers = (4 * vehicles - wheels) / 2;
        int fourWheelers = vehicles - twoWheelers;
        
        System.out.println(twoWheelers + " " +  fourWheelers);
    }
}