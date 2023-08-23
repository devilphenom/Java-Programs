import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A special charcter , digit ,vowel , consonent : ");
		char ch = scan.next().charAt(0);
		scan.close();
		if(Character.isDigit(ch)) {
			System.out.println("Entered Character "+ch+" is a Digit!");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Entered Character "+ch+" is a Special Character :");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			if(Character.isLowerCase(ch)) {
				System.out.println("Enterd Charcter "+ch+" is a lower case vowel...");
			}
			else {
				System.out.println("Enterd Character "+ch+" is a Upper case vowel...");
			}
			break;
			
			default:
				if(Character.isLowerCase(ch)) {
					System.out.println("Enterd Charcter "+ch+" is a lower case Consonent...");
				}
				else {
					System.out.println("Enterd Character "+ch+" is a Upper case Consonent...");
				}
			}
		}
	}

}
