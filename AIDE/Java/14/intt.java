public class intt{
	public static void main(String[] args){
		int[] a = {2,4,6,8};
		System.out.println(a[Integer.valueOf(args[0])]);
		for (int i = 0; i < a.length; i ++){
			System.out.println(a[i]);
		}
		int[] b = new int[5];
		b[0] = 95;
		System.out.println(b[0]);
	}
}
