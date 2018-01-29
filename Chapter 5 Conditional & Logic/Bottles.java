public class Bottles{
	public static void main(String []args){
		song(99);
		endVerse();
	}
	public static void endVerse(){
		System.out.println("No bottles of beer on the wall,");
		System.out.println("no bottles of beer,");
		System.out.println("ya\' can\'t take one down, ya\' can\'t pass it around,");
		System.out.println("\'cause there are no more bottles of beer on the wall!");
	}
	public static void song(int n){
		if(n == 0)
			return;
		System.out.println(n+" bottles of beer on the wall,");
		System.out.println(n+" bottles of beer,");
		System.out.println("ya\' take one down, ya\' pass it around,");
		System.out.println((n - 1)+" bottles of beer on the wall.");
		song(n - 1);
	}
}