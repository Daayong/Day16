package com.iu.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {

		System.out.println("-----START-----");
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = true; 
		
		while(check) {
			try {
				System.out.println("숫자를입력하세요");
				int num = sc.nextInt();
				int num2 = 20; 
				int num3 = num2/num;
				//예외가 발생하면 예외 객체 생성
				//ArithmeticException ar = new ArithmeticException();
				//catch(ar);
				System.out.println(num3);
				check = false;
			}catch(ArithmeticException e){
				//예외가 발생 했을 떄 실행 
				//예외 처리 
				System.out.println("예외처리가 되었습니다."); 
			
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.next();
			}catch(Exception e){
			
			}
		}
		
		
		
		
		
		System.out.println("-----FINISH-----");
	}

}
