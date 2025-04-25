package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void method2() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int iNum3 = sc.nextInt();
	    System.out.print("두번째 정수 : ");
	    int iNum4 = sc.nextInt();
	    
	    System.out.println("더하기 결과 : "+ (iNum3+iNum4));
	    int result = iNum3-iNum4;
	    System.out.println("빼기 결과 : "+ result);
	    System.out.println("곱하기 결과 : "+ (iNum3*iNum4));
	    System.out.println("나누기 결과 : " + iNum3/iNum4);
	    
				
		
		
	}
}
