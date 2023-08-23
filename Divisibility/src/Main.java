import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number which is greater than >100 : ");
		int n = scan.nextInt();
		divisibility(n);
		System.out.println(" ");
		System.out.println("All prime numbers till the given numbers are : ");
		int count = 0;
		for(int i=3;i<=n;i++) {
			int res = primeChecker(i);
			if(res!=0) {
				System.out.print(res+" ");
				count++;
			}
		}
		System.out.println(" ");
		System.out.println("Total Number of PRIME Numbers is : "+count);
		scan.close();
	}
	public static void divisibility(int num) {
		System.out.println("All numbers divisible by 2 are : ");
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("All numbers divisible by 3 are : ");
		for(int i=0;i<=num;i++) {
			if(i%3==0) {
				
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("All numbers divisible by 5 are : ");
		for(int i=0;i<=num;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("All numbers divisible by 2 and 5 are : ");
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				if(i%5==0) {
					System.out.print(i+" ");
				}
			}
		}
		System.out.println("");
		System.out.println("All numbers divisible by 3 and comes in table of 5 : ");
		for(int i=0;i<=num;i++) {
			if(i%3==0) {
				if(i%5==0) {
				System.out.print(i+" ");
				}
			}
		}
	}
	public static int primeChecker(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return 0;
			}
		}
		return num;
	}

}

