/* Given an array of integers, find the contiguous subarray (containing at least one 
number) which has the largest sum, and return that sum. 
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]    Output: 6 
arr = [1]   Output:  1  */

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i=1; i<n; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println(maxSum);
    }
}