package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
					
		Scanner sc = new Scanner(System.in);
					
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+num1/num);
		System.out.println("남는 사탕 개수 : "+num1%num);
		
	}
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int cla = sc.nextInt();
		
		System.out.print("반 : ");
		int ban = sc.nextInt(); 
		
		System.out.print("번호 : ");
		int num = sc.nextInt(); 
		
		sc.nextLine(); //버퍼비워주기
		
		System.out.print("성별 : ");
		char ch = sc.nextLine().charAt(0);
		String gender = ch == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double gar = sc.nextDouble();
		
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.",cla, ban, num, name, gender, gar);
				
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
				
		String result = age<=13 ? "어린이" : (
				age>13 && age<=19 ? "청소년" : "성인");
		
		System.out.println(result);
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
				
		int total = kor +eng + math;
		double avg = total/3.0;
				
		boolean result = kor>=40 && eng>=40 && math>=40 && avg>=60;
		
		System.out.println(total);		
		System.out.println(avg);		
		System.out.println(result ? "합격" : "불합격");		
		
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력(- 포함) : ");
		String res = sc.nextLine();
		
		char ch = res.charAt(7);
		String gender = ch == '1' || ch == '3' ? "남자" : "여자"; 
		
		System.out.println(gender);
		}

	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
				
		boolean result = num3<=num1 || num3>num2;
		System.out.println(result);
	}
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3) && (num3 == num1);
		
		System.out.println(result);
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double pay1 = ((double)num1*0.4)+(double)num1;
	    double pay2 = (double)num2;
	    double pay3 = ((double)num3*0.15)+(double)num3;
	    
	   String result1 = pay1>=3000 ? "3000이상" : "3000미만";
	   String result2 = pay2>=3000 ? "3000이상" : "3000미만";
	   String result3 = pay3>=3000 ? "3000이상" : "3000미만";
	   
	    		
	   System.out.println("A사원 연봉/연봉+a : "+(num1+"/"+pay1)+result1); 		
	   System.out.println(pay1>=3000 ? "3000이상" : "3000미만");
	   
	   
	   System.out.println("B사원 연봉/연봉+a : "+(num2+"/"+pay2)+result2); 		
	   System.out.println(pay2>=3000 ? "3000이상" : "3000미만");
	   
	   System.out.println("C사원 연봉/연봉+a : "+(num3+"/"+pay3)+result3); 		
	   System.out.println(pay3>=3000 ? "3000이상" : "3000미만"); 		
	}
	
	



}

