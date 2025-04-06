import java.util.Scanner;

class Main{

    public static String powerCheck(int n){
        if(n <= 0) return "NO";

        while(n % 2 == 0){
            n /= 2;
        }

        return (n == 1)? "YES" : "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        

        System.out.println(powerCheck(n));
    }
}