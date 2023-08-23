import java.util.Scanner;
public class SumOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to be summed : ");
		int num = scan.nextInt();
		SumOfDigits SumOfDigits = new SumOfDigits();
		System.out.println(SumOfDigits.totalSum(num));
		scan.close();
	}

}
