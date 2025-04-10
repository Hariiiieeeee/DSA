import java.util.Scanner;
// Given an array nums of n integers, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i]. Constraint: ● Do not use division. ● O(n) time, and constant space (excluding the output array). Sample Input/Output: Input: nums = [1,2,3,4] Output: [24,12,8,6]

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = new int[n];
        res[0] = 1;

        for(int i=1; i<n; i++){
            res[i] = res[i-1] * arr[i-1];
        }

        int right = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= right;
            right *= arr[i];
        }

        for(int i : res){
            System.out.print(i + " ");
        }

    }
}