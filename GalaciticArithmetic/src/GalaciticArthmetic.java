import java.util.Scanner;
public class GalaciticArthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		long result = galaciticAddition(num1,num2);
		System.out.println(result);
	}
	
	public static long galaciticAddition(long num1, long num2) {
		return num1+num2;
	}

}
