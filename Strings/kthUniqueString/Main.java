// Input Format
// The first line contains an integer N denoting the number of strings.

// The next N lines contain strings.

// The next line contains an integer k.

// Output Format
// The output contains the kth distinct string. If there are less than k unique string display -1.

// Constraints
// 1 <= N <= 10^3

// 1 <= String.length() <= 10^3

// Sample Testcase 0
// Testcase Input
// 6
// d
// b
// c
// b
// c
// a
// 2
// Testcase Output
// a
// Explanation
// The only strings in arr that are distinct are "d" and "a." The letter "d" comes first, making it the first separate string.

// Because "a" appears second, it is the second distinct string. "a" is returned since k == 2.

// Sample Testcase 1
// Testcase Input
// 3
// dac
// ba
// a
// 1 
// Testcase Output
// dac
// Explanation
// As all the strings are unique we have the strings in the order: 
// dac, ba, a

// Now, as we can see the value of k=1 therefore, the string returned is the 1st unique string = dac.

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int k = sc.nextInt();

        for(String key : map.keySet()){
            if(map.get(key) == 1){
                k--;
                if(k == 0){
                    System.out.println(key);
                    return;
                }                
            }
        }

        System.out.println(-1);
    }
}