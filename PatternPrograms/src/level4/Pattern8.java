package level4;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
