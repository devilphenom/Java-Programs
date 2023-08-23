
public class ArmstrongChecker {
	int Checker(int n) {
		
		int original = n;
		int rem =0;
		int am = 0;
	
		while(n!=0) {
		rem = n%10;
		am += Math.pow(rem,3);
		n = n/10;
		}
		
		if(am == original) {
			System.out.println("The given number is a Amstrong Number : ");
		}
		else {
			System.out.println("The given number is not an Amstrong Number.....!");
		}
		return am;
	}
}
