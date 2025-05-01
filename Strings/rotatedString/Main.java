// You are given two strings str1 and str2 and your task is to find out that str2 can be achieved or created after doing rotations on str1 or not.

// To solve this problem complete function rotationOfStrings with following parameters:

// String str1, str2: Two non empty strings str1 and str2 of same or different lengths.

// Function returns:

// String: The function returns a string containing "str2yes" if str2 can be formed from str1 with rotations otherwise return string with "str2no".



// Note: Try to give better solution in terms of running time.



// Constraints to be followed:

// 1 <= str1.length(), str2.length() <= 104

// All characters in the string are lowercase alphanumeric.



// Sample test case 1 :

// Input:

// abcd //str1

// bcda //str2

// Output:

// bcdayes // str2 followed by yes

// Sample test case 2:

// Input:

// abcd

// bdca

// Output:

// bdcano



// Brief editorial: In test case 1 with 3 rotations clockwise or 1 rotation anticlockwise on str1 we can form str2. But in second test case it is not possible.






public class Main {

    public static String rotationOfStrings(String str1, String str2) {
        String temp = str1 + str1;

        if (temp.contains(str2)) {
            return str2 + "yes";
        }

        return str2 + "no";
    }

    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        System.out.println(rotationOfStrings(str1, str2));
    }
}
