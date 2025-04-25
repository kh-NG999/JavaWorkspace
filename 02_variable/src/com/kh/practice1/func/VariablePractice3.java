package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double dNum1 = sc.nextDouble();
		System.out.print("세로 : ");
		double dNum2 = sc.nextDouble();
		
		System.out.println("면적 : "+ (dNum1*dNum2));
		System.out.println("둘레 : "+ (dNum1+dNum2)*2);
		
		
	}
	
}
