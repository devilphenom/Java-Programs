import java.util.Scanner;
public class PowerOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(squareNumber(scan.nextInt()));
		scan.close();

	}
	public static int squareNumber(int num) {
		return num *num;
	}
}
