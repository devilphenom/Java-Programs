import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter p01 for Pepsi | Enter p02 for Coke | Enter p03 for Fanta | Enter p04 for 7up | Enter p05 to Exit : ");
		product(scan.next());
		scan.close();
	}
	public static void product(String productId) {
		while(productId != "p05") {
			 switch (productId){
				 case "p01" :
					 System.out.println("Pepsi");
					 break;
					 
				 case "p02" :
					 System.out.println("Coke");
					 break;	 
					 
				 case "p03" :
					 System.out.println("Fanta");
					 break;
					 
				 case "p04" :
					 System.out.println("7up");
					 break;
					 
				default :
					System.out.println("open your eyes and read the product Id once again Idot......!");
					break;
				
			}
			 break;
		}
			
	}

}
