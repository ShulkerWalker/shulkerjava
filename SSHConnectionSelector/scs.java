package com.shulker.scs;
//ShulkerOliverChin-Project-2
import java.io.*;
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
                        System.out.println("[SCS]Please enter a option");
			java.lang.Thread.sleep(10);
			System.out.println("[SCS]<add> <Name> <Account> <IP> <Port>");
			System.out.println("[SCS]Add a ssh server config");
		}
		if (args[0]=="add"){
		}

	}
}
	
