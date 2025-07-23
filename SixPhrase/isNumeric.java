import java.util.Scanner;

class isNumeric{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        boolean numeric = true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)< '0' || str.charAt(i) > '9'){
                numeric = false;
                break;
            }
        }

        System.out.println(numeric);
    }
}