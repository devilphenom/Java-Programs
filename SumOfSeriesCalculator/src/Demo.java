import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the limit till which the Series should be calculated : ");
		int n = scan.nextInt();
		System.out.println(seriesCalculator(n));
		scan.close();
	}
	
	public static double seriesCalculator(double n) {
		double sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=1.0/i;
		}
		return sum;
	}

}
