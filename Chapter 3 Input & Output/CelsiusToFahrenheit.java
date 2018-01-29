import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String []args){
		Scanner get = new Scanner(System.in);
		System.out.print("Enter degree in celsius : ");
		double celsius = get.nextDouble();
		double fahrenheit = ((celsius * (9 / 5)) + 32);
		System.out.print(+celsius+" C = "+fahrenheit+" F");
	}
}