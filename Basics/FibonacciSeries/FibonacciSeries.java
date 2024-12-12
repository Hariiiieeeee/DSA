/*
 * 
 * Print the n-th number in a fibonacci series
 * 
 * Time complexity: O(n)
 * Space Complexity: O(n) 
 */

import java.util.Scanner;
public class FibonacciSeries {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[100];

		arr[0] = 1;
		arr[1] = 1;

		for(int i=2; i<n; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}

		System.out.print(arr[n-1]);

		
	}

}
