//ShulkerOliverChin-Project-2
import java.io.File;
public class scs {
	public static void main(String[] args) {
		System.out.println("[CSC]Welcome to SSHConnectionSelector");
		File file=new File("./scs_config/");
		File file1=new File("./scs_config/configs");
		try {
		}	catch (Object e) {
			if(!isDirectory()) {
				file.mkdir();
				file1.createNewFile();
			}
			else {
				file1.createNewFile();
			}
		}
	}
}
