import java.util.Scanner;
public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		int grade = scan.nextInt();
		gradeCheck(grade);
		scan.close();
	}
	public static void gradeCheck(int grade) {
		if (grade >= 50) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
}