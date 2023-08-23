import java.util.Scanner;
public class AmstrongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check Amstrong : ");
		ArmstrongChecker ArmstrongChecker = new ArmstrongChecker();
		System.out.println(ArmstrongChecker.Checker(scan.nextInt()));
		scan.close();
	}

}
