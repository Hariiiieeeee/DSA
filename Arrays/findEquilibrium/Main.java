// Find Equilibrium Point
// You are given a 
// 0
// −
// i
// n
// d
// e
// x
// e
// d
// 0−indexed integer array 
// n
// u
// m
// s
// nums. Your task is to find the leftmost equilibrium index in the array. An equilibrium index is defined as an index 
// i
// i such that the sum of the elements to the left of 
// i
// i is equal to the sum of the elements to the right of 
// i
// i.

// Formally, the equilibrium index 
// i
// i satisfies the condition:

// s
// u
// m
// (
// n
// u
// m
// s
// [
// 0
// ]
// +
// n
// u
// m
// s
// [
// 1
// ]
// +
// .
// .
// .
// +
// n
// u
// m
// s
// [
// i
// −
// 1
// ]
// )
// =
// s
// u
// m
// (
// n
// u
// m
// s
// [
// i
// +
// 1
// ]
// +
// n
// u
// m
// s
// [
// i
// +
// 2
// ]
// +
// .
// .
// .
// +
// n
// u
// m
// s
// [
// n
// u
// m
// s
// .
// l
// e
// n
// g
// t
// h
// −
// 1
// ]
// )
// sum(nums[0]+nums[1]+...+nums[i−1])=sum(nums[i+1]+nums[i+2]+...+nums[nums.length−1])

// Conditions:

// If 
// i
// i is 
// 0
// 0, the left sum is considered 
// 0
// 0.
// If 
// i
// i is 
// (
// n
// −
// 1
// )
// (n−1), the right sum is considered 
// 0
// 0.
// Input Format
// The first line of input will contain a single integer 
// T
// T, denoting the number of test cases.
// Each test case consists of two lines of input:
// The first line contains an integer 
// N
// N, length of array.
// The next line contain an array 
// n
// u
// m
// s
// nums of length 
// N
// N.
// Output Format
// For each test case, return the leftmost equilibrium index if it exists, or return 
// −
// 1
// −1 if there is no such index.

// Constraints
// 1
// ≤
// T
// ≤
// 100
// 1≤T≤100
// 1
// ≤
// N
// ≤
// 1
// 0
// 5
// 1≤N≤10 
// 5
 
// −
// 1
// 0
// 5
// ≤
// n
// u
// m
// s
// i
// ≤
// 1
// 0
// 5
// −10 
// 5
//  ≤nums 
// i
// ​
//  ≤10 
// 5
 
// Sample 1:
// Input
// Output
// 3
// 5
// 1 -1 2 1 -2
// 3
// 1 -1 4
// 6
// 1 2 3 4 5 6
// 0
// 2
// -1
// Explanation:
// Test Case 1: For index 0, the left side is considered 0, and the right side sum is -1 + 2 + 1 + (-2) = 0. Hence, index 0 is an equilibrium index.
// Test Case 2: For index 2, the sum of numbers before index 2 is: 1 + -1 = 0 and sum of numbers after index 2 is: 0.
// Test Case 3: No index satisfies the equilibrium condition.

import java.util.Scanner;

public class Main {
    public static int findEquilibrium(int n, int[] arr){
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }
        
        int leftSum = 0;
        for(int i=0; i<n; i++){
            int rightSum = totalSum - arr[i] - leftSum;
            
            if(leftSum == rightSum){
                return i;
            }
            
            leftSum += arr[i];
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            System.out.println(findEquilibrium(n, arr));
        }
    }
}
