package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		
		String str = sc.nextLine();
		
		char word = str.charAt(0);
		char word1 =str.charAt(1);
		char word2 =str.charAt(2);
		
		System.out.println("첫 번째 문자 : "+word);
		System.out.println("두 번째 문자 : "+word1);
		System.out.println("세 번째 문자 : "+word2);
		
		
		
	}
	
}
