// Given a number n, compute the factorial of n using Dynamic Programming to avoid redundant calculations. 
// [ Input: 5 Output:120] 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] fact = new long[n+1];

        fact[0] = 1;

        for(int i=1; i<=n; i++){
            fact[i] = fact[i-1] * i;
        }

        System.out.println(fact[n]);
    }
}