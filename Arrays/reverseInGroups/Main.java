// Reverse array in groups
// Difficulty: BasicAccuracy: 37.48%Submissions: 348K+Points: 1Average Time: 15m
// Given an array arr of positive integers. Reverse every sub-array group of size k.

// Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't return any array, modify the given array in place.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5], k = 3
// Output: [3, 2, 1, 5, 4]
// Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
// Input: arr[] = [5, 6, 8, 9], k = 5
// Output: [9, 8, 6, 5]
// Explnation: Since k is greater than array size, the entire array is reversed

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();
        
        for(int i=0; i<n; i+=k){
            int left = i;
            int right = Math.min(i+k-1, n-1);
            
            while(left < right){
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                
                left++;
                right--;
            }
        }
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends