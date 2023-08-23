import java.util.Scanner;
public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is prime or not : ");
		int no = scan.nextInt();
		if (no<=2) {
			System.out.println("The given Number is PRIME!");
		}
		else {
			for(int i = 2;i<no;i++) {
				if(no %i == 0) {
					System.out.println("The given number of Not Prime!!");
					return;
				}
			}
			System.out.println("Entered Number "+no+" is Prime");
		}
	}

}
