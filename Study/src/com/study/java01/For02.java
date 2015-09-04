package com.study.java01;

import java.util.Scanner;

/*문제2.
요구사항] 구구단을 출력하시오.
입력]        단 : 5
출력]
==========
5 단
==========
5 X 1 =  5
5 X 2 = 10
 
조건] 단을 입력받아서*/
public class For02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력  : ");
		int n=sc.nextInt();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i==n) {					
					System.out.println(i +" X "+ j +" = "+i*j );
				}
			}
		}
	}
}
