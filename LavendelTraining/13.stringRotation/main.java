/*
 * 1.Given two strings s1 and s2, write a function to check whether s2 is a rotation of s1. A 
string is considered a rotation if it can be obtained by shifting some characters from the 
beginning of s1 to the end, without changing the order. 
Input 1:  
s1 = "waterbottle" 
s2 = "erbottlewat" 
Output: True 
Input 2:  
s1 = "chatgpt" 
s2 = "gtpchat" 
Output: False 
 */

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()) {
            System.out.println("NO");
            return;
        }

        StringBuilder rstr = new StringBuilder(str1);

        for(int i=0; i<str1.length(); i++){
            if(str2.equals(rstr.toString())){
                System.out.println("YES");
                return;
            }
            // System.out.println(rstr.toString());

            char c = rstr.charAt(0);
            rstr.deleteCharAt(0);
            rstr.append(c);
        }

        System.out.println("NO");

    }
}