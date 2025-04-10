/*
 * A string is called bad if it contains three consecutive vowels or five consecutive 
consonants. Otherwise, it's called a good string. 
You are given a lowercase string. Write a program to check whether the string is good or 
bad. 
Input: str = "aeiobcdf"   Output: Bad 
Input: str= "helloworld"  Output: Good 

 */
import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int vowel = 0;
        int cons = 0;

        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cons = 0;
                vowel++;
            }
            else{
                vowel = 0;
                cons++;
            }

            if(vowel >=3 || cons >= 5){
                System.out.println("BAD");
                return;
            }
        }

        System.out.println("GOOD");
    }
}