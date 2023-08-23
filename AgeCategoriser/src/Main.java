import java.util.Scanner;
public class Main {
	public static void categorizeAge(int age) 
//Child (0-12), Teen (13-19), Adult (20-59), Senior (60+)
	 {  

		if (age >0 & age <= 12) {
			System.out.println("Child");
		}
		else if(age>12 & age<=19) {
			System.out.println("Teen");
		}
		else if(age>19 & age<=59) {
			System.out.println("Adult");
		}
		else if(age>59) {
			System.out.println("Senior");
		}
		else {
			System.out.println("Enter the age corretly...!");
		}

	} 

	 public static void main(String[] args) 

	 {   
		 System.out.println("Enter your Age : ");
		 Scanner scan = new Scanner(System.in);
		 categorizeAge(scan.nextInt());
		 scan.close();
	}  

}
