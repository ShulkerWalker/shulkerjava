public class storage {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Input a value of i!");
		}
		else {
			int i = Integer.valueOf(args[0]);
			int j = 20;
			System.out.println("i is :" + i);
			System.out.println("j is :" + j);
			int k = i + j;
			System.out.println("i + j is :" + k);
			int x = i * j;
			System.out.println("i * j is :" + x);
		}
	}
}
