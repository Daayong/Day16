package com.iu.s3.exception;

public class Exception_2 {
	public static void main(String [] args) {
	
		Test1 test1 = new Test1();
		
		try {
			 test1.t1();
		}catch(Exception e) {
			System.out.println("예외처리 시작");
			//e.printStackTrace();
			
			System.out.println("예외처리끝");
		}
		
		
		//int [] ar = null;
		//Test2 test2 = new Test2();
	//	test2.t2(ar);
		
		
		
	}
}
