package com.iu.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {

	
	
	public void write2() {
	 Scanner sc = new Scanner(System.in);
	//id pw age 입력 
	File file = new File("C:\\test","member.txt");	
	 System.out.println("ID를 입력하세요");
	 String name = sc.next();
	 System.out.println("PW를 입력하세요");
	 String pw = sc.next();
	 System.out.println("Age를 입력하세요");
	 String age = sc.next();
	 
	 	StringBuffer sb = new StringBuffer();
	 
	 	sb.append("ID : "+name+"\t");
	 	sb.append("PW : "+pw+"\t");
	 	sb.append("Age : "+age);
	 
	 	String info = sb.toString();
	 //c->test-> member.txt. 에 작성되게 
	 //id - pw - age 순으로 입력 
		 
	 	try {
	 		FileWriter fw2  = new FileWriter(file,true);
			fw2.write(info+"\r\n");
			fw2.flush();
	 	} catch (IOException e) {
			e.printStackTrace();
		}
	 
	}
	
	/*
	public void write() {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\test","test.txt");
		System.out.println("메세지를 입력하셍 ");
		
		String message= sc.next();
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(message);
			fw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
	}*/
}
