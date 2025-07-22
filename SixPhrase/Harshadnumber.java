import java.util.*;
class Harshadnumber {
	public static void main (String [] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int org = n;
		int sum  = 0;
		while(n>0){
			int digit = n%10;
			sum += digit;
			n/=10;
		}	
		if (org % sum == 0)
		System.out.println("Harshad Number");
		else
		System.out.println("Not Harshad Number");
	}	
}