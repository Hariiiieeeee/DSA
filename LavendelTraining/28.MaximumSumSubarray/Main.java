//  Given an array of integers and a number k, 
// find the maximum sum of a contiguous subarray of size k using the sliding window technique. 
// Input: arr= [2 1 5 1 3 2 6] k=3 
// Output: 11 

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int left = 0;
        int current = 0;
        int maxSum = 0;

        for(int right=0; right<n; right++){
            if(right - left + 1 > k){
                current -= arr[left];
                left++;
            }

            current += arr[right];
            maxSum = Math.max(maxSum, current);
        }

        System.out.println(maxSum);
    }
}