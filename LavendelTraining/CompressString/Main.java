// You are given a string that contains only lowercase letters. Your task is to compress the string by replacing each group of repeating characters with the character followed by the number of times it appears consecutively. Sample I/P 1: Input: aaabbcccc Output: a3b2c4 Sample I/P 2: Input: abbbcc Output: a1b3c2 


import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder res = new StringBuilder();
        int count = 1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                res.append(str.charAt(i)).append(count);
                count=1;
            }
        }

        res.append(str.charAt(str.length()-1)).append(count);

        System.out.println(res.toString());
    }
}