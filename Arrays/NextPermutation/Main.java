/*
 * Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.

Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

Time Complexity: O(n), where n is the size of the given array.
Auxiliary Space: O(1), The algorithm performs in-place operations (modifying the array directly) without using extra space proportional to the input size.

 */

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        
        int pivot = -1;
        for(int i=n-1; i>0; i--){
            if(arr[i-1] < arr[i]){
                pivot = i-1;
                break;
            }
        }
        
        if(pivot == -1){
            reverse(arr, 0, n-1);
            return;
        }
        
        for(int i=n-1; i>pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot);
                break;
            }
        }
        
        reverse(arr, pivot+1, n-1);
    }
    
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    void reverse(int[] arr, int left, int right){
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}

//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends