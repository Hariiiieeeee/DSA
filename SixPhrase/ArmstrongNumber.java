import java.util.*;
class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int len = String.valueOf(n).length();
		
		int original = n;
		int sum = 0;
		while(n > 0){
			int digit = n % 10;
			sum += Math.pow(digit, len);
			n /= 10;
}
		
		if(original == sum) System.out.println("Armstrong number");
		else System.out.println("Not Armstrong number");
		
}

}