import java.util.Scanner;
public class doubleTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();		
		System.out.println(doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
