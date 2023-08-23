import java.util.Scanner;
public class SemesterMarksAveragerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		SemesterMarksAverager average = new SemesterMarksAverager();
		System.out.printf("%.2f",average.calculateAverage(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt())).println();
	}

}
