
public class Palindrome {
	public static void Reverse(int n) {
		int oreginal = n;
		int rem=0; 
		int rev = 0;
		while(n!=0) {
			 rem = (n%10);
			 rev = (rev*10)+rem;
			 n = n/10;
		}
		if(oreginal==rev) {
			System.out.println("The given Number is a Palindrome :)(: :: ");
		}
		else {
			System.out.println("The given Number is not a Palindrome......!");
		}
		System.out.println("Given No : "+oreginal);
		System.out.println("Revrsed No : "+rev);
		

	}
}
