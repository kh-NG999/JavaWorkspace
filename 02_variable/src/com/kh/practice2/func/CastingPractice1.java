package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void method () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		char ch = sc.nextLine().charAt(0);
	
		
		System.out.println(ch+ " unicode : "+ (int) ch);
	}
	
}
