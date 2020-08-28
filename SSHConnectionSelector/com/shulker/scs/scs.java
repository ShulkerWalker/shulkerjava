package com.shulker.scs;
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
		if (args.length==0){
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			System.out.println("[SCS]Please enter a option");
			System.out.println("[SCS]<add> <Name> <Account> <IP> <Port>");
			System.out.println("[SCS]Add a ssh server config");
		}
		else if (args[0].equals("add")){
			try{

			}
		}
	}
}
	
