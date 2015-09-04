package com.study.java02;

import java.util.Scanner;

/*	문제4.
요구사항] 숫자를 입력받아 3자리마다 ,를붙이시오.
입력] 숫자 : 1000000
출력] 결과 : 1,000,000
조건] %,d 사용금지(형식문자X)	*/
public class StringClass04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuffer str= new StringBuffer();
		
		System.out.println("입력하세요");
		int n = sc.nextInt();
		str.append(n);
		String res ="";
		
		//  0이 될떄까지 1000으로 나누는 횟수
		int count=0;
		while (n/1000!=0) {
			n=n/1000;
			++count;
			System.out.println(n);
		}
		
		System.out.println(count);
		// 그 횟수대로 세어서 문자열의 총길이 - 3 씩 증가 , 단 ',' 추가되므로 
		// 중간에 한번 돌린후에 -1 더 차감해야함 
		int temp= 0;
		for (int i = 1; i <= count; i++) {
			System.out.println("100 으로 나누어 질수 있는것들");
			str.insert((str.length()-3*i)-temp, ','); 
			System.out.println(str);
			++temp;
		}
			
			
		
		
	}
}
