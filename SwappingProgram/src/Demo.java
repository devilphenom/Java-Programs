import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers for A and B respectively : ");
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println("Before swapping A = "+A+" and B= "+B+"...");
		int temp = A;
		A = B;
		B= temp;
		System.out.println("After swapping A = "+A+" and B= "+B+"...");
		scan.close();
	}

}
