// Given a unsorted array arr[] of positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

// Examples :

// Input: arr[] = [1, 2, 1, 5, 5]
// Output: 2
// Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
// Input: arr[] = [2, 30, 2, 15, 20, 30, 15]
// Output: 20
// // Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.


//{ Driver Code Starts
// Initial Template for Java
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.findUnique(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findUnique(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        
        for(int i : arr){
            if(counter.containsKey(i)){
                counter.put(i, counter.get(i)+1);
            }else{
                counter.put(i, 1);
            }
        }
        
        for(int i : arr){
            if(counter.get(i) == 1) return i;
        }
        
        return -1;
    }
}