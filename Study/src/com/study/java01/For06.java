package com.study.java01;
/*문제6.
요구사항] 아래와 같이 출력하시오
출력] 1 + 2 + 3 + 4 +5 ... + 42 + 43 = 1025
조건] 누적합이 1000을 넘어가는 순간까지  출력
조건] 무한루프, if, break*/
public class For06 {
	public static void main(String[] args) {
		
		
		int i = 1;
		int res = 0;
		while (true) {
			res=res+i;
			if(res <= 1000) {
				System.out.print(i);
				System.out.print(" + ");
			}
			
			if (res >= 1000) {
				System.out.print(" = "+ res);
				break;
			}
			++i;
		}
		
		
		
	}
}
