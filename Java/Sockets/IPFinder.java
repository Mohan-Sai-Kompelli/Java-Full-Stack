
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class IPFinder {
	
	public static void main(String[] args) throws IOException {
		InetAddress address ;
		address = InetAddress.getLocalHost();
		System.out.println("Ip Address : "+address.getHostAddress());
		
		
		//---------------------------------------------------------------------------------------------
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println();
		
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Host Name: ");
		name = br.readLine();
		InetAddress addr ;
		addr = InetAddress.getLocalHost();
		System.out.println("Ip Address : "+addr.getHostAddress());
		
	}

}


//package com.codegnan.Sockets;
//
//import java.net.InetAddress;
//import java.rmi.UnknownHostException;
//
//public class IPFinder {
//	
//	public static void main(String[] args) throws java.net.UnknownHostException {
//		InetAddress address ;
//		try {
//			address = InetAddress.getLocalHost();
//			System.out.println("Ip Address : "+address.getHostAddress());
//		}catch(UnknownHostException e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//}
