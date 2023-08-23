import java.util.Scanner;
public class FactroialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		factroial(scan.nextInt());
		scan.close();
	}
	static void factroial(int n) {
		int factroial = 1;
		for (int i=1;i<=n;i++) {
			factroial *=i;
		}
		System.out.println(factroial);
	}
}