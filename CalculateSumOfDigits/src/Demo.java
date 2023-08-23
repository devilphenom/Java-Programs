import java.util.Scanner;
public class Demo {

	public static void calculateSumOfDigits(int n) { 
		// your code here 
		int sum =0;
		while(n!=0) {
		int rem = n%10;
		sum += rem;
		int qout = n/10;
		n=qout;
		}
		System.out.println(sum);
		} 
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSumOfDigits(n); 
		scan.close(); 
	}
		

}
