// Input Format
// The first line contains a single integer n representing number of operations.

// From the Second line take input a vector of a string(the operations to perform) of size n.

// Output Format
// Print  the sum of all the scores remaining in the record after processing all operations

// Constraints
// 1 <= ops.length <= 10^3

// ops[i] is "C", "D", "+", or a string representing an integer in the range

// [-3 * 10^4, 3 * 10^4].

// For operation "+", there will always be at least two previous scores on the record.

// For operations "C" and "D", there will always be at least one previous score on the record.

// Sample Testcase 0
// Testcase Input
// 8
// 1 2 + C D 8 D +
// Testcase Output
// 55
// Explanation
// - Aniket records 1: [1] - Aniket records 2: [1, 2] - Aniket records the sum of the last two scores (1 + 2): [1, 2, 3] - Aniket invalidates the previous score: [1, 2] - Aniket records double the previous score (2 * 2): [1, 2, 4] - Aniket records 8: [1, 2, 4, 8] - Aniket records double the previous score (8 * 2): [1, 2, 4, 8, 16] - Aniket records the sum of the last two scores (8 + 16): [1, 2, 4, 8, 16, 24] Total score: 1 + 2 + 4 + 8 + 16 + 24 = 55

// Sample Testcase 1
// Testcase Input
// 7
// 3 4 + D C D +
// Testcase Output
// 49
// Explanation
// - Aniket records 3: [3] - Aniket records 4: [3, 4] - Aniket records the sum of the last two scores (3 + 4): [3, 4, 7] - Aniket records double the previous score (7 * 2): [3, 4, 7, 14] - Aniket invalidates the previous score: [3, 4, 7] - Aniket records double the previous score (7 * 2): [3, 4, 7, 14] - Aniket records the sum of the last two scores (7 + 14): [3, 4, 7, 14, 21] Total score: 3 + 4 + 7 + 14 + 21 = 49

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        List<Integer> lst = new ArrayList<>();

        for(String token : arr){
            switch(token){
                case "C":
                    if(!lst.isEmpty()) lst.remove(lst.size()-1);
                    break;
                case "D":
                    if(!lst.isEmpty()) lst.add(lst.get(lst.size() - 1) * 2);
                    break;
                case "+":
                    if(lst.size() >= 2){
                        int a = lst.get(lst.size()-1);
                        int b = lst.get(lst.size()-2);
                        lst.add(a+b);
                    }
                    break;

                default:
                    try{
                        int num = Integer.parseInt(token);
                        lst.add(num);
                    }catch(NumberFormatException e){

                    }

            }
        }

        int sum = 0;
        for(int i : lst){
            // System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}