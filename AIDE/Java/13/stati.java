public class stati {
	public static void main(String[] args){
		foo();
		foo();
		bar();
		print("Hello");
		print("World");
		printSum(10,20);
		printSum(100,200);
		int x = sum(200,300);
		System.out.println(x);
		System.out.println(mult(128,256));
	}
	static void foo(){
		System.out.println("Inside foo");
	}
	static void bar(){
		System.out.println("Inside bar");
	}
	static void print(String str){
		System.out.println(str);
	}
	static void printSum(int a,int b){
		System.out.println(a + b);
	}
	static int sum(int a, int b){
		return a + b;
	}
	static int mult(int a, int b){
		return a * b;
	}
}
