/*
 * Given a string s, determine if it is a palindrome, considering only alphanumeric 
characters and ignoring cases.A palindrome is a string that reads the same backward 
as forward after removing non-alphanumeric characters and converting all letters to the 
same case. 
Input: "A man, a plan, a canal: Panama"      Output: true
 */

 import java.util.Scanner;

 class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder newStr = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }

        if(newStr.toString().equals(newStr.reverse().toString())){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
 }