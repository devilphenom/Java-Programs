import java.util.Scanner;
public class stringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(stringJoin(scan.nextLine(),scan.nextLine()));
	}
	public static String stringJoin(String str1,String str2) {
		return str1+" "+str2;
	}
}
