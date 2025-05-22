// Examine the array arr[] comprising N distinct integers. Your objective is to determine whether the array remains sorted after undergoing a counter-clockwise rotation. It is imperative to note that a conventionally sorted array, without any rotations, does not qualify as sorted and rotated in this context. In essence, ascertain the presence of at least one rotation for the array to be considered as sorted and rotated.

 

// Example:

// Input: arr[] = { 3, 4, 5, 1, 2 } 

// Output: true 

// Explanation: 

// Sorted array: {1, 2, 3, 4, 5}. 

// Rotating this sorted array clockwise 

// by 3 positions, we get: { 3, 4, 5, 1, 2}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > arr[(i+1) % n]) count++;

            if(count > 1){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}