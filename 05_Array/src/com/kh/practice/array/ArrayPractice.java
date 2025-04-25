package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[10];

		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
			System.out.print(arr[i]+" ");
		}
		//System.out.println(Arrays.toString(arr));
	}

	public void practice2() {
		int[] arr = new int[10];

		for (int i = 10; i > 0; i--) {
			arr[10 - i] = i; // arr[0] = 10 ,.... 1 // arr[10] = 0
		}
//		int value = 10;
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = value--;
//		}

		System.out.println(Arrays.toString(arr));
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 1; i <= num; i++) {
			arr[i - 1] = i;
		System.out.print(arr[i-1]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));

	}

	public void practice4() {

		String[] str = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(str[1]);
	}

	public void practice5() {

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char []arr = str.toCharArray();

		System.out.print("문자 : "); // a
		char cs = sc.nextLine().charAt(0);
		
		int count = 0;		
		System.out.printf("%s에 %c가 존재하는 위치 : ", str, cs);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == cs) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(cs+"의 개수 : "+count);
	}

	public void practice6() {

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] str = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		if (num >= 0 && num < 7) {
			System.out.print(str[num]);
		} else {
			System.out.print("잘못 입력하셨습니다");
		}
	}

	public void practice7() {

		System.out.print("정수 : ");
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		int[] arr = new int[num];

		for (i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			arr[i] = num2;
			sum += arr[i];
		}
		for(i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");	
		//for(int i : arr) {
		//System.out.print(i+" ");
		
			
		}
		System.out.println();
		System.out.print("총합 : "+sum);

	}
	
	public void practice8 () {
		
		System.out.print("정수 : ");
		int size = sc.nextInt();
	
		
		if(size%2==0 || size <3) {
			System.out.println("다시 입력하세요");
			practice8();
			return;
		}
		
		int[] arr = new int[size];
		int mid = size/2;
		int value = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i<=mid) {
			    arr[i] = ++value;
			}else {
				arr[i] = --value;
			}
		}
		System.out.println(Arrays.toString(arr));
		
				
	}
	
	public void practice9() {
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		String [] arr = {"마늘치킨","후라이드","양념치킨","간장치킨"};
		
		for(int i=0; i<arr.length; i++) {
			if(str.equals(arr[i])) {
				System.out.println(str+" 배달 가능");
				return;
			}
		}
		System.out.println(str+"은 없는 메뉴입니다");
	}
	
	public void practice10 () {
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[]origin = str.toCharArray();
		char[] copy = origin.clone();
		
		for(int i=8; i<copy.length; i++) {
			copy[i] = '*';
		}
		System.out.println(copy);
	}
	
	public void practice11() {
		
		int[]arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]);
		}
	}
	
	public void practice12() {
		
		int[]arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice13( ) { //어려움
		
		int[]arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			// x번째 인덱스에 랜던값 추가시 0부터 x-1번째 인덱스의 값들과 중복검사
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					// 중복 랜던값 존재
					i--; //추가해야 다시 실행했을 때 x번쨰 인덱스 부터 다시 시작
					break;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void practice14() { //어려움
		
		int[]arr = new int[6];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--; 
					break;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
		// 중첩반복문
		// 버브소트 -> 가까운 두값을 비교하여 가장 큰값을 마지막으로 옮기는 정렬방식
		// 외부반복문 반복횟수 ?
		// 내부반복문 반복구조 ? 0,1 | 1,2 | 2,3 | 3,4 | 4,5 |
		for(int i = 0 ; i<arr.length-1 ; i++) {
			for(int j = 0 ; j<arr.length -i -1 ; j++) {
				if(arr[j] > arr[j+1]) {
					// ex) 45 > 30
					// -> 30값을 temp에 저장 -> 뒤쪽 인덱스에 앞쪽 인덱스의 값을 저장 
					// 45, 45 -> 앞쪽 인덱스의 값을 변수에 저장된 값으로 치환
					// 30, 45
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
			}
		}
	}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice15() {
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char [] arr = new char[str.length()];
		
		char [] origin = str.toCharArray();
		
		int index = 0;
		System.out.print("문자열에 있는 문자 : ");
		for (int i=0 ; i<origin.length; i++) {
			char ch = origin[i];
			boolean result = false;
			for(int j=0; j<index; j++) {
				if(arr[j] == ch) {
					// arr에 이미 추가된 데이터
					result = true;
					break;
				}
			}
			if(!result) {
			arr[index++] = ch;
			
		}
		}
		char [] arr2 = new char [index];
		System.arraycopy(arr, 0, arr2, 0, index);
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ (i !=index-1 ? ", " : ""));
		}
		
		System.out.println("\n문자 개수 : "+index);
	}
	
	public void practice16() {//어려움
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String [] str = new String[size];
		for(int i =0 ; i<size; i++) {
			System.out.printf("%d번째 문자열 : ", i+1);
			str[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까(Y/N) : ");
			char ch = sc.nextLine().toLowerCase().charAt(0);
			
			if(ch == 'n') {
				System.out.println(Arrays.toString(str));
				return;
			}
			
			System.out.print("더 입력하고 싶은 개수 : ");
			int moreSize = sc.nextInt();
			sc.nextLine();
			
			String [] copy = new String[str.length + moreSize];
			System.arraycopy(str, 0, copy, 0, str.length); // 깊은복사 완료
			
			for(int i=str.length; i<copy.length; i++) {
				System.out.printf("%d번째 문자열 : ", i+1);
				copy[i] = sc.nextLine();
		}
			str = copy; // copy본에 있는 데이터를 다시 str원본에 옮기는것
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
