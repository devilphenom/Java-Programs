import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TemperatureConverter TemperatureConverter = new TemperatureConverter();
		System.out.println(TemperatureConverter.convertFahrenheitToCelsius(scan.nextDouble()));
	}

}
