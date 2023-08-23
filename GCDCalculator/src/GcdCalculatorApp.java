import java.util.Scanner;
public class GcdCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print(GcdCalculator.gcd(scan.nextInt(),scan.nextInt()));
		scan.close();
	}

}
