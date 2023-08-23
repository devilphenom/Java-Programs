import java.util.Scanner;
public class journeyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JourneyCalculator journey1 = new JourneyCalculator();
		Scanner scan = new Scanner(System.in);
		System.out.printf("%.2f",journey1.calculateDistance(scan.nextDouble(),scan.nextDouble())).println();
	}

}
