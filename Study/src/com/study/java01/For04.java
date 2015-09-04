package com.study.java01;
/* 문제4.
요구사항] 아래와 같이 출력하시오
출력] 1 + 2 + 3 + 4 + 5 ... + 10 = 55
흰트] \b (백스페이스) */
public class For04 {
	public static void main(String[] args) {
		
		int res = 0;
		for (int i = 1; i <= 10; i++) {
			res=res+i;
			System.out.print(i);
			if(i < 10) System.out.print(" + ");
			if(i == 10) System.out.print(" = "+ res);
			
		}
		
	}
}
