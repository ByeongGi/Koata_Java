package com.study.java02;
/*문제6.
요구사항] 문장에서 특정 단어가 몇번 들어갔는지 세시오.
조건] String content = "안녕~ 길동아~ 잘가~ 길동아~";
String word = "길동";
출력] '길동'을 총 2회 발견했습니다.
힌트] 1.indexOf(검색어,시작위치)-> 검색0, 검색X(-1)
2.replace*/
public class StringClass06 {
	public static void main(String[] args) {
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int count = 0;
		int n = 0;
		while (content.length()>=n) {
			// System.out.println(n);
			n+=content.indexOf(word,n)+(word.length()); // 커서의 개념으로 설명할것 팀원들에게 
			++count;
		}
		System.out.println(word+"를  총 "+count+"회 발견했습니다.");
	}
}
