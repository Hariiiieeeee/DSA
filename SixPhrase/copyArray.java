import java.util.Scanner;

class copyArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[n];
        for(int i=0; i<n; i++){
            newArr[i] = arr[i]; 
        }

        for(int i :newArr) System.out.println(i);

    }
}