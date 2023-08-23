import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome...! : ");
		int n = scan.nextInt();
		Palindrome.Reverse(n);
		scan.close();
	}

}
