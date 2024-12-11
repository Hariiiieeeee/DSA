import java.util.Scanner;
public class FibonacciSeriesRecursive {

    static int[] arr;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        arr = new int[n];

		System.out.print(fibonacci(n-1));

		
	}

    public static int fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n]; // Return cached value
        }
        arr[n] = fibonacci(n - 1) + fibonacci(n - 2); // Compute and store result
        return arr[n];
    }

}
