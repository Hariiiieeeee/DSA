import java.util.Scanner;

class TryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            sc.close();
            System.out.println("Program Terminated");
        }

    }
}