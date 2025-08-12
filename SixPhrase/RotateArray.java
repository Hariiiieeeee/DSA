import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RotateArray{
    public static void reverse(int left, int right, List<Integer> arr){
        while(left < right){
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        int k = sc.nextInt();
        k %= n;

        reverse(0, n-1, arr);
        reverse(0, k-1, arr);
        reverse(k, n-1, arr);

        for(int i : arr) System.out.print(i + " ");
        
    }
}