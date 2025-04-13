// Write a program to generate and print the Hailstone Sequence starting from a given number n until it reaches 1. 
// The Hailstone Sequence is defined for a given positive integer n as follows: 
// • If n == 1, the sequence ends. 
// • If n is even, the next number is n / 2. 
// • If n is odd, the next number is 3 * n + 1.
//  Input: 40 
//  Output: 40 20 10 5 16 8 4 2 1 

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n >= 1){
            System.out.print(n + " ");

            if(n == 1) break;

            if(n % 2 == 0){
                n = n/2;
            }else{
                n = 3 * n + 1;
            }
        }
    }
}