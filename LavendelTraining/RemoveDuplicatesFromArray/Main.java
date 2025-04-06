import java.util.HashSet;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> Set = new HashSet<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            Set.add(i);
        }

        int count = 0;
        for(int i : Set){
            arr[count] = i;
            count++;
        }

        for(int i=0; i<count; i++){
            System.out.print(arr[i] + " ");
        }
    }
}