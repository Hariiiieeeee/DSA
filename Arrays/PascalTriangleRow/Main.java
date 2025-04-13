import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 1;

        System.out.print(res + " ");

        for(int i=1; i<=n; i++){
            res = res * (n+1-i);
            res = res / i;

            System.out.print(res + " ");
        }


    }
}