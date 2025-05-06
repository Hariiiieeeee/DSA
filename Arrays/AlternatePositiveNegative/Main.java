// Alternate Positive Negative
// Difficulty: EasyAccuracy: 33.86%Submissions: 217K+Points: 2Average Time: 10m
// Given an unsorted array arr containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.

// Note:
// - Resulting array should start with a positive integer (0 will also be considered as a positive integer).
// - If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.
// - The array may or may not have the equal number of positive and negative integers.

// Examples:

// Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
// Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]
// Explanation: The positive numbers are [9, 4, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then -2 after that 4 and then -1 and so on.
// Input: arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
// Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
// Explanation : The positive numbers are [5, 2, 4, 7, 1, 8, 0] and the negative integers are [-5,-2,-8]. According to the given conditions we will start from the positive integer 5 and then -5 and so on. After reaching -8 there are no negative elements left, so according to the given rule, we will add the remaining elements (in this case positive elements are remaining) as it in by maintaining the relative order.
// Input: arr[] = [9, 5, -2, -1, 5, 0, -5, -3, 2]
// Output: [9, -2, 5, -1, 5, -5, 0, -3, 2]
// Explanation: The positive numbers are [9, 5, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then -2 after that 5 and then -1 and so on.


//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int i : arr){
            if(i < 0) neg.add(i);
            else pos.add(i);
        }
        
        int p = 0;
        int n = 0;
        int i=0;
        
        while(p < pos.size() && n < neg.size()){
            arr.set(i++, pos.get(p++));
            arr.set(i++, neg.get(n++));
        }
        
        while(p < pos.size()){
            arr.set(i++, pos.get(p++));
        }
        
        while(n < neg.size()){
            arr.set(i++, neg.get(n++));
        }
    }
}