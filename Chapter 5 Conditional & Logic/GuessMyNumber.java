//A program that generates a number and keeps on asking the user for input until he guess it
import java.util.*;
public class GuessMyNumber{
	
	public static void main(String []args){
		setGuess();
	}
	//Method to get the users input and set the number to be guessed using the Random class
	public static void setGuess(){
		Scanner get = new Scanner(System.in);
		Random random = new Random();
			
			System.out.println("I'm thinking of a number between 1 and 100");
			System.out.println("(including both). Can you guess what it is?");
			System.out.print("Type a number : ");
			int n = get.nextInt();
			int rand = random.nextInt(100) + 1;
			
			//Checks if users input is greater than or less than the number generated
			if(n > rand){
				System.out.println("The guess is too high\n");
			}else{
				System.out.println("The guess is too low\n");
			}
		//loop to keep on requesting the users guess as long as its not right
		while(n != rand){
			if(n == rand){
				break;
			}
			setGuess();
		}
		win();
	}
	//Method to congratulate the user on his success 
	public static void win(){
		System.out.println("Congratulations!");
		System.out.println("You guessed it right");
		System.out.println("Win! Win! Win! Win! Win!");
	}
}