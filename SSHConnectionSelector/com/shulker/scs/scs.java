//ShulkerOliverChin-Project-2
import java.io.*;
import java.nio.file.Files;

public class scs {
	public static void main(String[] args) {
		System.out.println ("[SCS]Welcome to SSHConnectionSelector");
		File file=new File ("./config");
		if(!file.exists()) {
			file.mkdir();
		}
		try{
			BufferedWriter bw=new BufferedWriter (new FileWriter ("./config/server.json"));
			bw.write ("//Put your server's config here.");
			bw.close ();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		if (args.length > 0){
			if (args[0].equals("add")){
				if (args.length == 5){
					System.out.println("[SCS]Add server's config successfully <" + args[1] + ">" + args[2] + "@" + args[3] + ":" + args[4]);
				}
				else {
					System.out.println("[SCS]Usage: add <Name> <Account> <IP> <Port>");
				}
			}
			else if (args[0].equals("delete")){
				if(args.length == 2){
					System.out.println("[SCS]Delete server's config successfully <" + args[1] + ">");
				}
				else {
					System.out.println("[SCS]Usage: delete <Name>");
				}
			}
			else if (args[0].equals("ssh")){
				if (args.length == 2){
					System.out.println("[SCS]Ssh connection " + "<" + args[1] + ">" + "start");
				}
				else {
					System.out.println("[SCS]Usage: ssh <Name>");
				}
			}
			else if (args[0].equals("sftp")){
				if (args.length == 2){
					System.out.println("[SCS]Sftp connection " + "<" + args[1] + ">" + "start");
				}
				else {
					System.out.println("[SCS]Usage: sftp <Name>");
				}
			}
			else if (args[0].equals("list")){
				System.out.println("[SCS]Configurations list");
			}
			else {
				System.out.println("[SCS]Please enter a option");
				System.out.println("[SCS]<add> <delete> <ssh> <sftp> <list>");
			}
		}
		else {
			System.out.println("[SCS]Please enter a option");
			System.out.println("[SCS]<add> <delete> <ssh> <sftp> <list>");
		}
    }
}
	
