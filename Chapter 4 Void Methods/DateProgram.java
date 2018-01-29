public class DateProgram{
	public static void main(String []args){
		printAmerican("Sunday", 22, "July", 2015);
	}
	public static void printAmerican(String day, int date, String month, int year){
		System.out.println(day+", "+month+" "+date+", "+year);
	}
}