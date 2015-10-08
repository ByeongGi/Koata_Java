package com.study.java01;

import java.util.Scanner;

/*문제1.
요구사항] 횟수를 입력받아 인사를 하시오.
입력]        횟수 :3
출력]        
안녕하세요~
안녕하세요~
안녕하세요~*/
public class For01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력  : ");
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i+"번째"+" . 안녕하세요");
		}
	}
}
