

// Write a Java program to check if a given number is prime or not.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n <= 1){
            System.out.println("Not a prime!");
            return;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Not a Prime");
                return;
            }
        }
        
        System.out.println("Prime");
    }
}