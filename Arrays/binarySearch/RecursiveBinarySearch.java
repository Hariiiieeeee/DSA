package Arrays.binarySearch;
//Recursive approach for binary search

//Time complexity: O(logn)
//Space complexity: O(logn)

import java.util.Scanner;

class RecursiveBinarySearch{
    public static int binarySearch(int arr[], int target, int left, int right){
        if(left <= right){
            int mid = (left+right) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                return binarySearch(arr, target, left, mid-1);
            }
            else{
                return binarySearch(arr, target, mid+1, right);
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

        int result = binarySearch(arr, target, 0, n);
        System.out.println(result);
    }
}