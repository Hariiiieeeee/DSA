import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        long res = 1;

        for(int i=0; i<c-1; i++){
            res = res * (r-i-1);
            res = res / (i+1);
        }

        System.out.println(res);
    }
}