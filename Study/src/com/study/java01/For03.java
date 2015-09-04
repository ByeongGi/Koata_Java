package com.study.java01;

import java.util.Scanner;
/*문제3.
요구사항] 숫자 1개 입력받아.. 1부터 ~ 숫자까지의 합 (누적)
입력]        숫자 : 5
출력]        1 ~ 5 = 15*/
public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 ~ 숫자까지의 합  : ");
		int n = sc.nextInt();
		int res = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("i = "+i);
			System.out.println("res + i = " +(res+i));
			res =res+ i; // 합의 공식 
		}
		
		System.out.println(res);
		
		
	}
}
