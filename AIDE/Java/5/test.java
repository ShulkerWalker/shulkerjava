public class test {
	public static void main(String[] args) {
		boolean a = 10 < 20;
		boolean b = 20 > 20;
		boolean c = 10 == 20;
		boolean d = 10 != 20;
		boolean e = 10 <= 20;
		boolean f = 10 >= 20;
		boolean g = 123 + 456 < 987 - 654;
		boolean h = "hello".equals("hello");
		boolean i = "hello".equals("hi");
		System.out.println("Is 10 less than 20?:" + a);
		System.out.println("Is 10 greater than 20?:" + b);
		System.out.println("Is 10 equal to 20?:" + c);
		System.out.println("Isn't 10 equal to 20?:" + d);
		System.out.println("Is 10 less than or equal to 20?:" + e);
		System.out.println("Is 10 graeter than or equal to 20?:" + f);
		System.out.println("Is '123' plus '456' less than '987' cut '654'?:" + g);
		System.out.println("Is String 'hello' equal to 'hello'?:" + h);
		System.out.println("Is String 'hello' equal to 'hi'?;" + i);
	}
}
