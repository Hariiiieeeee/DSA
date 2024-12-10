//Binary search looping method

//Time complexity: O(logn)
//Space complexity: O(1)

import java.util.Scanner;

class binarySearch{
    public static int binarySearch(int arr[], int target){
        int right = arr.length;
        int left = 0;

        while(left <= right){
            int mid = (left+right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}