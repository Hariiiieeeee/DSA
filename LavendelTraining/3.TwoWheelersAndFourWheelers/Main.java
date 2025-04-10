// Given the total number of vehicles (totalVehicles) and the total number of wheels (totalWheels), find the number of two-wheelers and four-wheelers. Assumption: The vehicles are only two-wheelers (bikes) and four-wheelers (cars). Formula Used: Let: x = Number of two-wheelers y = Number of four-wheelers


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