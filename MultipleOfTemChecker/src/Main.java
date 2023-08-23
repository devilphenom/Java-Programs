import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		checkMultipleOfTen(scan.nextInt());
		scan.close();
	}
	public static void checkMultipleOfTen(int n) 
	{ 
	 if(n%10 == 0) {
		 System.out.println("The Given Numner is Multiple Of 10 : ");
	 }
	 else {
		 System.out.println("The givennumber is not a multiple of 10 ");
	 }
	} 
}
