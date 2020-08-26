//ShulkerOliverChin-Project-2
import java.io.*;
public class scs {
	public static void main(String[] args) {
		System.out.println ("[CSC]Welcome to SSHConnectionSelector");
		File file=new File ("./config");
		if(!file.exists()) {
			file.mkdir();
		}
		try{
			BufferedWriter bw=new BufferedWriter (new FileWriter ("./config/server.json"));
			bw.write ("//Put your server's config here.");
			bw.close ();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
