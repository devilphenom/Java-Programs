import java.util.Scanner;
public class CubeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(cubeNumber(scan.nextInt()));
		scan.close();
	}
	public static int cubeNumber(int num) {
		return num * num * num;
	}
}
