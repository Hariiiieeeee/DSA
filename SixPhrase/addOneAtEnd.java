import java.util.Scanner;

class addOneAtEnd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            if(arr[i] != 9) {
                arr[i] += 1;
                break;
            }else{
                arr[i] = 0;
            }
        }

        if(arr[0] == 0){
            int[] res = new int[n+1];
            res[0] = 1;

            for(int i=1; i<n+1; i++){
                res[i] = arr[i-1];
            }

            for(int i=0; i<n+1; i++){
                System.out.print(res[i] + " ");
            }
            return;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}