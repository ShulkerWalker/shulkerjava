public class test {
	public static void main (String[] args) {
		if (args.length < 2) {
			System.out.println("Input value of a & b");
		}
		else {
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			int min;
			String c;
			if (a < b) {
				System.out.println("a is less than b");
				min = a;
				c = "a";
		}
			else {
				System.out.println("a is greater than b");
				min = b;
				c = "b";
			}
			System.out.println("Min is " + c + ":" + min);
		}
	}
}
