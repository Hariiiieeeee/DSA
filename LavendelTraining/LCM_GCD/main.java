/*
    Write a program to compute the Greatest Common Divisor (GCD) of two numbers 
    using recursion, and then compute their Least Common Multiple (LCM) 
    Input: (a = 15 , b = 20)              
    Output: (GCD: 5,LCM: 60) 
 */

import java.util.Scanner;

class main{
    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return (a*b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("gcd: " + gcd(a, b));
        System.out.println("lcm: " +lcm(a, b));
    }
}