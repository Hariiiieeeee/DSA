/*Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
  */

  class Solution {
    public double myPow(double x, int n) {
        double power = 1;

        for(int i=1; i<=Math.abs(n); i++){
            power *= x;
        }
        
        if(n < 0){
            power = 1/power;
        }

        return power;
    }
}