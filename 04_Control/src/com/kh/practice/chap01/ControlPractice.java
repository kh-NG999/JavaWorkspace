package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	

	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
	    switch(menu) {
	    
	    case 1 : 
	    	System.out.print("입력");
	    	break;
	    case 2 :
	    	System.out.print("수정");
	    	break;
	    case 3 :
	    	System.out.print("조회");
	    	break;
	    case 4 :
	    	System.out.print("삭제");
	    	break;
	    case 7 :
		    default : 
		    System.out.printf("없는");
		
		}
	    System.out.println(" 메뉴입니다.");
		
	}
	
	public void practice2() {
		
		System.out.print("숫자를 한 개 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num>0 && (num%2)==0) {
			System.out.println("짝수다");
		}else if(num%2==1 && num>0) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해 주세요.");
		}
	
	}
	
	public void practice3() {
		
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		boolean pass = kor >=40 && math >= 40 && eng >= 40 && avg >= 60;
		
		if(!pass) {
			System.out.println("불합격");
			return;
		}
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합격");
	
//		if(pass) {
//			System.out.println("국어 : "+kor);
//			System.out.println("영어 : "+eng);
//			System.out.println("수학 : "+math);
//		    System.out.println("합격");
//		
//		}else {
//			System.out.println("불합격");
//		}
//		
		
		
	}
	
	public void practice4() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 1 : case 12 : case 2 :
			season = "겨울";
			break;
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		case 6, 7, 8 :
			season = "여름";
		    break;
		case 9 : case 10 : case 11 :
			season = "가을";
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다. ", month, season);
			return;
		}
		System.out.printf("%d월은 %s입니다.", month, season);
		
//		switch(month) {
//		case 1 :  // month == 1 
//		case 2 : // month == 2
//		case 12 :	
//			System.out.println("겨울");
//			break;
//		case 3 :
//		case 4 :
//		case 5 :
//		   System.out.println("봄");
//		   break;
//		case 6 :
//		case 7 :
//		case 8 :
//			System.out.println("여름");
//			break;
//		case 9 : 	
//		case 10 : 	
//		case 11 :
//			System.out.println("가을");
//			break;
//		default :
//			System.out.println("해당하는 계절이 없습니다.");
//			
//		}
//		
	}
	
	
	public void practice5() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		if(id.equals("myId") && pass.equals("myPassword12")) {
			System.out.println("로그인 성공");
			return;
		
		if(!id.equals("myId")) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다. ");
		}

			
//		}else {
//			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	

	public void practice6() {
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자" : 
			System.out.println("회원관리, 게시글 관리 ");
		case "회원" :
			System.out.print("게시글 작성, 댓글작성 ");
		case "비회원" :
			System.out.print("게시글 조회");
			break;
		default : 
			System.out.print("존재하지 않는 등급입니다.");
		}
	}

		
//		if(grade.equals("관리자")) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		}else if(grade.equals("회원")) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		}else if(grade.equals("비회원")) {
//			System.out.println("게시글 조회");
//		}
	
		
		
	
	
	
	public void practice7() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("BMI 지수 : "+bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		
		}else if(18.5<=bmi && bmi<23) {
			System.out.println("정상체중");
		
		}else if(23<=bmi && bmi<25) {
			System.out.println("과체중");
		
		}else if(25<=bmi && bmi<30) {
			System.out.println("비만");
		
		}else if(30>=bmi){
			System.out.println("고도 비만");
		}
			
  
		
		}

	public void practice8() {
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(!(ch == '+' ||ch == '-' ||ch == '*' ||ch == '/' ||ch == '%')) {
		      System.out.println("잘못입력했습니다. 프로그램을 종료합니다.");
		      return;
		}
	
		System.out.printf("%d %c %d = ", num1, ch, num2);
	    switch(ch) {
	    case'+' :
	    	System.out.printf("%d", (num1+num2));
	    	break;
	    case'-' :
	    	System.out.printf("%d %c %d = %d", num1, ch, num2, (num1-num2));
	    case'*' :
	    	System.out.printf("%d %c %d = %d", num1, ch, num2, (num1*num2));
	    case'/' :
	    	System.out.printf("%d %c %d = %f", num1, ch, num2, ((double)num1/num2));
	    case'%' :
	    	System.out.printf("%d %c %d = %f", num1, ch, num2, (num1/num2));
	    }
	
	}

	
	public void practice9() {
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalTest =sc.nextInt();
		System.out.print("과제 점수 : ");
		int report = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		
		double mid_final = mid*0.2;
		double final_final = finalTest*0.3;
		double report_final = report*0.3;
		double attend_point = attend*1.0;
		
		double total = mid_final + final_final + report_final + attend_point;
		
		System.out.println("=============결과=============");
		if(attend_point <= 14) {
			System.out.println("Fail [출석 회수 부족("+attend+"/20]");
			return;
		}
		
		System.out.println("중간 고사 점수(20) : "+mid_final); 			
			System.out.println("기말 고사 점수(30) : "+final_final); 			
			System.out.println("과제 점수(20) : "+report_final); 			
			System.out.println("출석 점수(20) : "+attend_point); 			
			System.out.println("총점 : "+total);
		if(total>=70) {
			 			
			System.out.println("PASS"); 			
		}else {
			System.out.println("Fail [점수 미달]");
		}
	}
	
	public void practice10() {
		
		System.out.println("실행할 메서드를 번호로 선택하세요(1~0 : ");
		int menu = sc.nextInt();
		
		sc.nextLine();
		
		switch(menu) {
		case 1 : 
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			
		
		}
		
		
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();
		
		if(!(pwd >= 1000 && pwd <= 9999)) {
			System.out.println("자리 수 안 맞음");
			return;
		}
		
		int first = pwd / 1000;
		int second = pwd / 100 % 10;
		int third = pwd /10 % 10;
		int fourth = pwd % 10 ;
		
		// first 와 second, third, fourth
		// second와 third, fourth
		// third와 fourth
		if(first == second || first ==third || first == fourth
				|| second == third || second == fourth
				||third == fourth) {
			System.out.println("중복값 있음");
		}else {
			System.out.println("생성 성공");
		}
	
}
}