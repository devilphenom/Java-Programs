import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1=0;
		int n2=1;
		int nextNo = n1+n2;
		System.out.println("Enter the range till which the fibonacci series should be Printed : ");
		int range = scan.nextInt();
		scan.close();
		if(range==1) {
			System.out.println(n1);
		}
		else if(range==2) {
			System.out.println(n1+" "+n2);
		}
		else {
			System.out.print(n1+" ");
			System.out.print(n2+" ");
			for(int i = 3;i<=range;i++) {
				nextNo=n1+n2;
				n1=n2;
				n2=nextNo;
				System.out.print(nextNo+" ");
			}
		}
	}

}
