package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i = 0;
		for (i = 1; i <= num; i++) {
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}
	
	public void practice3() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		for (int i = num; i <= num && 1 <= i; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			continue;
			}
			
			for (int i = num; i <= num && 1 <= i; i--) {
				System.out.print(i + " ");
			}break;
		}
	}
	
	public void practice5() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;		
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i+ (i==num ? " = " : " + "));
		}
		System.out.print(sum);
	}
	
	public void practice6() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
//		if (num1<1 || num2<1 ) {
//			System.out.println("1 이상의 숫자를 입력해주세요");
//			return;
//		}
//		
//		if (num1>num2) {
//			for (int i = num2; i<=num1; i++) {
//				System.out.print(i+" ");
//			}
//			
//		}
//		if (num2>num1) {
//			for (int i = num1; i<=num2; i++) {
//				System.out.print(i+" ");
//			}
//			
//		}
		if(num1 <1 || num2<1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
			practice7(); // 7번문제 해답. 6번에서 practice7();만 입력하면됨
			return;
		}
		
		int min = num1>num2 ? num2 : num1;
		int max = num1>num2 ? num1 : num2;
		
		for(int i= min; i<=max; i++) {
			System.out.print(i+" ");
		}
		
	}
	
	public void practice7() {
		
		
		while(true) {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1<1 || num2<1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			continue;
		}
		
		if (num1>num2) {
			for (int i = num2; i<=num1; i++) {
				System.out.print(i+" ");
			}
			
		}
		if (num2>num1) {
			for (int i = num1; i<=num2; i++) {
				System.out.print(i+" ");
			}
		}
		break;
	}
	}
	
	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		    
		System.out.println("===== "+num+"단 =====");
		
		for (int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i);
			System.out.println();
			
		}
	}
	
	public void practice9() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.print("9 이하의 숫자만 입력해주세요");
			return;
		}
		
		for (; num<=9; num++) {
		System.out.println("===== "+num+"단 =====");
	    for (int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i);
			System.out.println();
		}
	}
	}
	
	public void practice10() {
		
		while(true) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.print("9 이하의 숫자만 입력해주세요");
			System.out.println();
			continue;
		}
		
		for (int j = num; j<=9; j++) {
		System.out.println("===== "+j+"단 =====");
	    for (int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d", j, i, j*i);
			System.out.println();
		}
	    }
		break;
	}
	}
	
	public void practice11() {
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
//		if (num2<0) {
//			for (int i = num1; i>= num2*9+num1; i+= num2) {
//				System.out.print(i+" ");
//			}
//		
//		for (int i = num1; i <= num2*9+num1; i += num2 ) {
//			System.out.print(i+" ");
//		}
//		}
		
		for(int i=0; i<10; i++) {
			System.out.print(num1 + num2*i);
		}
	}
	
	public void practice12() {
		
		while(true) {
		
		System.out.print("연산자(=, -, *, /, %) : ");
		String str = sc.nextLine();
		
		if(str.equals("exit")) {
			System.out.print("프로그램을 종료합니다");
			break;
		}
		
		char ch = str.charAt(0);
		
		if(ch == '/' ||ch == '%' ||ch == '+' ||ch == '-' ||ch == '*' ) {
			System.out.println("없는 연산자, 재입력");
			continue;
		}
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(ch =='/' && num2 ==0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요");
			continue;
		}
		
		switch(ch) {
		case '+' :
			System.out.printf("%d %c %d = %d",num1,ch,num2,num1+num2);
			break;
		case '-' :
			System.out.printf("%d %c %d = %d",num1,ch,num2,num1-num2);
			break;
		case '*' :
			System.out.printf("%d %c %d = %d",num1,ch,num2,num1*num2);
			break;
		case '/' :
			System.out.printf("%d %c %d = %d",num1,ch,num2,num1/num2);
			break;
		case '%' :
			System.out.printf("%d %c %d = %d",num1,ch,num2,num1%num2);
			break;
		}
	}
	}
	
	public void practice13() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int j=1; j<num; j++) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	}
	
	public void practice14() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int j=num; j>0; j--)
		for(int i=0; i<j; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
}