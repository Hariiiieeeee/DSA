// Consecutive Prime Sum
// Some prime numbers can be expressed as a sum of other consecutive prime numbers.

// For Example

// 5
// =
// 2
// +
// 3
// 5=2+3,
// 17
// =
// 2
// +
// 3
// +
// 5
// +
// 7
// 17=2+3+5+7,
// 41
// =
// 2
// +
// 3
// +
// 5
// +
// 7
// +
// 11
// +
// 13
// 41=2+3+5+7+11+13.
// Your task is to find out how many prime numbers which satisfy this property are present in the range 
// 3
// 3 to 
// N
// N subject to a constraint that summation should always start with number 
// 2
// 2.

// Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.

// Input Format
// The first line of input will contain a single integer 
// N
// N
// Output Format
// Print the total number of all such prime numbers which are less than or equal to 
// N
// N.

// Constraints
// 2
// <
// N
// ≤
// 1
// 0
// 5
// 2<N≤10 
// 5
 
// Sample 1:
// Input
// Output
// 20
// 2

import java.lang.*;
import java.util.*;

class Main
{
    public static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        
        if(n == 2) return true;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		
		for(int i=3; i<=n; i++){
		    if(isPrime(i)) list.add(i);
		}
		
		int count = 0;
		int total = 0;
		
		for(int i=0; i<list.size(); i++){
		    total += list.get(i);
		    
		    if(i == 0) continue;
		    
		    if(total > n) break;
		    
		    if(isPrime(total)) count++;
		}
		
		System.out.println(count);

	}
}
