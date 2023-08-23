import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find it's Factors : ");
		int no = scan.nextInt();
		System.out.println("Factros of the number is :");
		for(int i=1;i<=no;i++){
			if(no % i==0) {
				System.out.print(i+" ");	
			}
		}
	}

}
