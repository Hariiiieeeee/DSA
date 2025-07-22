import java.util.*;
class MinMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        double res = n/Math.pow(10,len);
        System.out.println(res);

    }
}