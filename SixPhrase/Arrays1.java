import java.util.Scanner;

class Arrays1{
    public static void main(String[] args){
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}