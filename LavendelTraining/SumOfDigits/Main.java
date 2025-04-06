// Sum of Digits Until Single Digit Problem: Given a number n, repeatedly add its digits until the result is a single digit. Example: Input: 9875 Step 1: 9 + 8 + 7 + 5 = 29 Step 2: 2 + 9 = 11 Step 3: 1 + 1 = 2 Output: 2
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int n = num;

        while(n >= 10){
            int sum = 0;
            while(n > 0){
                sum += n%10;
                n /= 10;
            }

            n = sum;
        }

        System.out.println(n);
    }
}