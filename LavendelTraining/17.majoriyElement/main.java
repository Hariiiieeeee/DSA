/*
 *  Given an array nums of size n, find the majority element — the element that appears 
more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the 
array. 
nums = [3, 2, 3]    Output: 3 
 */

 import java.util.Scanner;

 class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int el = arr[0];
        int count = 0;

        for(int i : arr){
            if(count == 0){
                el = i;
                count = 1;
            }

            else if(i == el) count++;

            else count--;
        }

        System.out.println(el);
    }
 }