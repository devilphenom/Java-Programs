import java.util.Scanner;
public class calculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		for( ; ; ) {
			System.out.println("Enetr your choice form + | - | * | ! | / | % | ^ : ");
			System.out.println("the result is : " + Calculator.calculate(scan.next()));	
		}	
	}
}
