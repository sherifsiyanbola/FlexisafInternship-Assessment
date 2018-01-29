public class FermatProgram{
	public static void main(String []args){
		checkFermat(2, 2, 2, 2);
	}
	public static void checkFermat(int a, int b, int c, int n){
		double x = Math.pow(a, n) + Math.pow(b, n);
		if(n > 2 && Math.pow(c, n) == x){
			System.out.println("Holy smokes, Fermat was wrong!");
		}else{
			System.out.println("No, that doesn\'t work.");
		}
	}
}