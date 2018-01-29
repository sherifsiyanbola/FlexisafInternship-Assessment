import java.util.*;
public class GuessMyNumber{
	public static void main(String []args){
		Scanner get = new Scanner(System.in);
		Random random = new Random();
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Type a number : ");
		int num = get.nextInt();
		int rand = random.nextInt(100) + 1;
		System.out.println("Your guess is : " +num);
		System.out.println("The number i was thinking of is : " +rand);
		System.out.println("You were off by "+(rand - num));
	}
}