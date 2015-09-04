package com.study.java02;

import java.util.Scanner;

/*문제5.
요구사항] 숫자를 입력받아 한글로 바꾸시오.
입력] 금액(원) : 1500
출력] 결과 : 천오백 원
조건] 입력은 천단위까지
힌트] 1 ->일, 5->오
단위(천,백,십) -> 문자열 자릿수
1234
*/
public class StringClass05 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("입력하세요");
		int n = sc.nextInt();
		String str = String.valueOf(n);
		
		
		//  0이 될떄까지 1000으로 나누는 횟수 검사 
		int count=0;
		while (n/10!=0) { n=n/10; ++count;}
		// System.out.println(count);

		
		// 문자 한글 변환
		str=str
		.replace("1", "일").replace("2", "이").replace("3", "삼")
		.replace("4", "사").replace("5", "오").replace("6", "육")
		.replace("7", "칠").replace("8", "팔").replace("9", "구")
		.replace("0", " ");
		
		// 자리수 단위 문자열 삽입 
		sb.append(str);
		int temp= 0;
		String unit="";
		for (int i = 1; i <= count; i++) {
			if (i==1) unit="천";
			if (i==2) unit="백";
			if (i==3) unit="십";
			sb.insert(i+temp, unit); 
			++temp;
		}
		
		// 기타 불필요 문자열 제거 및 처리 
		str=sb.toString();
		str=str.replace("일천", "천").replace("일백", "백").replace("일십", "십").replace(" ", "");
		System.out.println(str+"원");
		
	}
}
