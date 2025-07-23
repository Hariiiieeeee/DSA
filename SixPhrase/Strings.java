import java.util.Scanner;

class Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("Equals: " + (str1.equals(str2))? "YES":"NO");
    }
}