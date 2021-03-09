public class igreater0 {
	public static void main (String[] args) {
		if (args.length==0){
			System.out.println("Input a value of i");
		}
		else {
			int i = Integer.valueOf(args[0]);
			if (i > 0) {
				System.out.println("i is greater than 0");
			}
			else {
				System.out.println("i is not greater than 0");
			}
			if (i % 2 == 0) {
				System.out.println("i is even");
			}
			else {
				System.out.println("i is not even");
			}
		}
	}
}
