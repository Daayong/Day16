package com.iu.s3.exception;

public class Test3 {

	public void t3() throws Exception{
		//유치원 - 두자리수 
		int num1 = 20;
		int num2 = 70; 
		
		int num3 = num1 + num2; 
		int num4 = num1 - num2;
		
		if(num3>99) {
			throw new MyException("세자리 수는 몰라여");
		}
		
		if (num4 < 0) {
			throw new MyException("음수는 몰라요");
		}
		
		System.out.println(num3);
	}
}
