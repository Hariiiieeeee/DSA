import java.util.Scanner;

class SparseMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] sparse = new int[n][3];
        int k=0;
        int p=0;

        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                if(arr[i][j] > 0){
                    sparse[k][p++] = i;
                    sparse[k][p++] = j;
                    sparse[k][p] = arr[i][j];

                    k++;
                    p=0; 
                }
                               
            }
            
        }

        for (int i = 0; i < n; i++) {
            for(int j=0; j<3; j++){
                System.out.println(sparse[i][j]);
            }
        }

    }
}