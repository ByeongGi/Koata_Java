package com.study.java02;

import java.util.Scanner;

/*문제3.
요구사항] 숫자를 입력받아 항상 3자리(문자열)로 만드시오.
입력] 숫자 : 1
출력] 결과 : 001
입력] 숫자 : 25
출력] 결과 : 025
입력] 숫자 : 123
출력] 결과 : 123
힌트] 숫자 -> 숫자(/,%), 숫자 -> 문자(문자열함수)*/
public class StringClass03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		String res = "";
		if (num/100 !=0) res = String.valueOf(num);
		else if(num/10 !=0)   res = "0".concat(String.valueOf(num));
		else res = "00".concat(String.valueOf(num));
		
		System.out.println(res);
	}
}
