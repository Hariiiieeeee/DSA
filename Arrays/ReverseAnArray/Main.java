// You are given an array of integers arr[]. Your task is to reverse the given array.

// Examples:

// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]
// Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.
// Input: arr = [4, 5, 2]
// Output: [2, 5, 4]
// Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
// Input: arr = [1]
// Output: [1]
// Explanation: The array has only single element, hence the reversed array is same as the original.
// Constraints:
// 1<=arr.size()<=105
// 0<=arr[i]<=105

//{ Driver Code Starts
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public void reverseArray(int arr[]) {
        
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
    }
}

// Time complexity : O(n/2)
// Space complexity : O(1)