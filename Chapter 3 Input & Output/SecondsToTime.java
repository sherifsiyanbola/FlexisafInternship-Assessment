import java.util.Scanner;
public class SecondsToTime{
	public static void main(String []args){
		Scanner get = new Scanner(System.in);
		System.out.print("Enter seconds : ");
		int secs = get.nextInt();
		int min = secs / 60;
		int hrs = min / 60;
		System.out.print(+hrs+" hours, "+min%60+" minutes, "+secs%60+" seconds");
		
	}
}