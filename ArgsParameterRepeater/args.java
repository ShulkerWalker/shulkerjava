//ShulkerOliverChin-Project-1
public class args {
	public static void main(String[] args) {
		System.out.println("[Args]: Welcome to the Args parameter repeater");
		if(args.length==0) {
			System.out.println("[Args]: Please enter a parameter");
		}
		else {
			System.out.println("[Args]: "+args[0]);
		}
	}
}
