import java.util.Scanner;
public class Calculator {
  public static int calculate(String choice) {
	  Scanner scan = new Scanner(System.in);
	  switch(choice) {
	  case "+":
		  System.out.println("Enter the number to be added : ");
		  return scan.nextInt() + scan.nextInt();
	  case "-":
		  System.out.println("Enter the number to be subtracted : ");
		  return scan.nextInt() - scan.nextInt();  
	  case "/":
		  System.out.println("Enter the number to be divided : ");
		  return scan.nextInt() / scan.nextInt();  
	  case "%":
		  System.out.println("Enter the number to for remainder : ");
		  return scan.nextInt() % scan.nextInt();
	  case "*":
		  System.out.println("Enter the number to be multiple : ");
		  return scan.nextInt() * scan.nextInt();  
	  case "^":
		  System.out.println("Enter the number to be powered : ");
		  int num = scan.nextInt();
		  return num * num;  
	  case "!":
		  System.out.println("Stoped...! ");
		  return 0;
	  }
	  return 0;
  }
}
