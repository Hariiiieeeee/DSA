import java.util.*;
// import java.util.StringBuilder;

public class reverseWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            if(res.toString().length() > 0){
                res.append(" ");
            }
            res.append(words[i]);
        }

        System.out.println(res.toString());

    }
}
