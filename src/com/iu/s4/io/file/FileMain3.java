package com.iu.s4.io.file;

import java.io.File;

public class FileMain3 {
	public static void main(String [] args) {
		File file = new File("C:\\");
		
		String [] names = file.list();
		File [] files = file.listFiles();
		
		for(int i =0; i<names.length; i++) {
			File file2 = new File(file,names[i]);
			System.out.println(names[i]);
			if(file2.isDirectory()) {
				System.out.println("폴더명입니다");
			}else {
				System.out.println("파일명입니다");
			}
		}
		
		
	}
}
