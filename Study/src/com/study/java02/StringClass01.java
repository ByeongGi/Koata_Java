package com.study.java02;

import java.util.Scanner;

public class StringClass01 {
//	문제1.
//	요구사항] 문장을 하나 입력하면 역순으로 출력하시오.
//	입력] 문장 : 안녕하세요~
//	출력] 결과 : ~요세하녕안
//	힌트] 문자열 index	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("입력하세요");
		String str= sc.nextLine();
		String res="";
		for (int i = 0; i < str.length(); i++) {
			res+=str.substring(str.length()-i-1,str.length()-i); // 뒤에서부터 차례대로 추출한후 다시 저장 
			System.out.println(res);
		}
		
		System.out.println(res);
	}
}
