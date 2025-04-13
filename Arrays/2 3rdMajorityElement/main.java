// You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

// Note: The answer should be returned in an increasing format.

// Examples:

// Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
// Output: [5, 6]
// Explanation: 5 and 6 occur more n/3 times.
// Input: arr[] = [1, 2, 3, 4, 5]
// Output: []
// Explanation: o candidate occur more than n/3 times.

//{ Driver Code Starts
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int el1 = -1;
        int el2 = -1;
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i : nums){
            if(i == el1) cnt1++;
            
            else if(i == el2) cnt2++;
            
            else if(cnt1 == 0){
                el1 = i;
                cnt1++;
            }
            
            else if(cnt2 == 0){
                el2 = i;
                cnt2++;
            }
            
            else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1 = 0;
        cnt2 = 0;
        
        for(int i : nums){
            if(i == el1) cnt1++;
            
            if(i == el2) cnt2++;
        }
        
        if(cnt1 > nums.length / 3) list.add(el1);
        
        if(cnt2 > nums.length / 3) list.add(el2);
        
        if(list.size() == 2 && list.get(0) > list.get(1)){
            int temp = list.get(0);
            list.set(0, list.get(1));
            list.set(1, temp);
        }
        
        return list;
    }
}
