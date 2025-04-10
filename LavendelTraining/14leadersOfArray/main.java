/* 
Given an array of integers, your task is to find all leader elements in the array. 
An element is a leader if it is strictly greater than all the elements to its right in the 
array. The rightmost element is always a leader. 

1. arr = [16, 17, 4, 3, 5, 2] Output: [17, 5, 2] 
2. arr = [1, 2, 3, 4, 0] Output: [4, 0]
 */


import java.util.ArrayList;
import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();

        if(arr[0] > arr[1]){
            res.add(arr[0]);
        }

        for(int i=1; i<n-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                res.add(arr[i]);
            }
        }

        res.add(arr[n-1]);

        for(int i : res){
            System.out.print(i + " ");
        }
    }
}