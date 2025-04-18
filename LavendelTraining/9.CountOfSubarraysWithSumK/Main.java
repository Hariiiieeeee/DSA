
// Given an array of integers nums and an integer k, 
// return the total number of continuous subarrays whose sum equals to k. 
// Sample Input/Output: 
// Input: nums = [1,1,1], k = 2 
// Output: 2

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
        int right = 0;
        int sum = 0;
        int count = 0;

        while(right <= n && left <= n){
            if(sum == k){
                count++;
                sum -= arr[left];
                sum += arr[right];
                left++;
                right++;
            }

            else if(sum < k){
                sum += arr[right];
                right++;
            }

            else{
                sum -= arr[left];
                left++;
            }
        }

        System.out.println(count);
    }
}