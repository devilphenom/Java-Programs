package Level3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j = 1;j<=i && j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j = 5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
