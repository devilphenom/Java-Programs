
public class SumOfDigits {
	public int totalSum(int number) {
		int sum = 0;
		while (number!=0) {
		int n = number%10;
		sum+=n;
		number = number/10;
		
		}
		return sum;
	}
}