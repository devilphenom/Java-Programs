import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Sides in your Polygon : ");
		identifyPolygon(scan.nextInt());
		scan.close();
	}
	public static void identifyPolygon(int sides)
	{
		if(sides>0) {
		if(sides==3) {
			System.out.println("Triangle....");
		}
		else if(sides == 4) {
			System.out.println("Quadrilateral....");
		}
		else if(sides==5) {
			System.out.println("Pentagon....");
		}
		else if(sides==6) {
			System.out.println("Hexagon....");
		}
		else {
			if(sides<3) {
				System.out.println("Not Polygon....");
			}
			else {
				System.out.println("Polygon...");
			}
		}
		}
		else {
			System.out.println("I think you are Blind.....!");
	}
  }
}