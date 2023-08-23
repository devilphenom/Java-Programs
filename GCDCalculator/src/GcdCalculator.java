
public class GcdCalculator {
 public static int gcd(int m , int n) {
	 if (n!=0) {
		 int rem = m %n ; 
		 m=n;
		 n=rem;
	 }
	 return m;
 }
}
