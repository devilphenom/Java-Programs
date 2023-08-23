
public class ArthmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subtraction(20, 5));
		System.out.println(multiplication(4, 5));
		System.out.printf("%.2f",division(20, 4)).println();
		System.out.println(remainder(10, 3));

	}
	public static int multiplication(int num1,int num2) {
		return num1*num2;
	}
	
	public static int subtraction(int num1,int num2) {
		return num1-num2;
	}
	
	public static double division(int num1,int num2) {
		return num1/num2;
	}
	public static int remainder(int num1,int num2) {
		return num1%num2;
	}
}
