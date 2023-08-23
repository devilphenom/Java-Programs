import java.util.Scanner;
public class DiscountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total amount of your purchase : ");
		double purchaseAmount = scan.nextDouble();
		checkDiscount(purchaseAmount);
		scan.close();

	}
	public static void checkDiscount(double purchaseAmount) 

	 { 
		if (purchaseAmount > 100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount Not Applicable");
		}
	}  

}
