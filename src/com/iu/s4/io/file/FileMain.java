package com.iu.s4.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		File file = new File("C:\\test");
	
		boolean result=file.exists();
		result = file.isDirectory(); //폴더입니까?
		System.out.println(result);
		
		file = new File(file, "study1.txt");
		result=file.exists();
		result = file.isFile(); //파일입니까?
		System.out.println(result);
	}

}
