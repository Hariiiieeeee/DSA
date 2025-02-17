/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
 */

public class ReverseaNumber {

    public static void main(String[] args) {
        System.out.println(reverse(-100));
    }

    public static int reverse(int x) {
        int rev = 0, n = Math.abs(x);
        // if(x < 0){
        //     rev = 
        // }
        while(n!=0){
            int digit = n%10;
            if(rev > (Integer.MAX_VALUE - digit) / 10){
                return 0;
            }
            
            rev = (rev*10) + digit;
            
            n /= 10; 
        }

        return (x<0)? (-rev) : rev;

        
    }
}