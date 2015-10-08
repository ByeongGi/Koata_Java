package com.study.java02;

import java.util.Scanner;

/*문제2.
요구사항] 문장을 하나 입력하면 금지어에 마스킹을 하시오.
입력] 문장 : 바보야~ 메롱~
출력] 결과 : **야~ 메롱~
조건] 금지어 : 바보, 멍청이
힌트] replace*/
public class StringClass02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("입력하세요 :");
		String str = sc.nextLine();
		str=str.replace("바보", "**").replace("멍청이", "***");
		System.out.println(str);
	}
}
