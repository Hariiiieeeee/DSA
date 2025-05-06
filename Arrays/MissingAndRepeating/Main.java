// Missing And Repeating
// Difficulty: EasyAccuracy: 24.83%Submissions: 588K+Points: 2Average Time: 30m
// Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.

// Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].

// Examples:

// Input: arr[] = [2, 2]
// Output: [2, 1]
// Explanation: Repeating number is 2 and smallest positive missing number is 1.
// Input: arr[] = [1, 3, 3] 
// Output: [3, 2]
// Explanation: Repeating number is 3 and smallest positive missing number is 2.
// Input: arr[] = [4, 3, 6, 2, 1, 1]
// Output: [1, 5]
// Explanation: Repeating number is 1 and the missing number is 5.

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            while(arr[i] != arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            } 
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                res.add(arr[i]);
                res.add(i+1);
                break;
            }
        }
        
        return res;
    }
}
