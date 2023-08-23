package alphabitPattern;

public class Pattern1 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}
