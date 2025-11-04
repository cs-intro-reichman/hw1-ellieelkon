// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args [0]) ;
		int a = (int) (Math.random() * num) ;
		int b = (int) (Math.random() * num) ;
		int c = (int) (Math.random() * num) ;
		int min = Math.min(a, Math.min(c, b)) ;
		int max = Math.max(a, Math.max(c, b)) ;
		int mid = a + b + c - min - max ;
		System.out.println(a + " " + b + " " + c) ;
		System.out.println(min + " " + mid + " " + max);
	}
}
