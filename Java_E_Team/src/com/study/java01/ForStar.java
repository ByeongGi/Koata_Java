package com.study.java01;

public class ForStar {
	public static void main(String[] args) {
		
		String str = "";
		for (int i = 1; i < 10; i++) {
			if (i<=5) str+="*";
			if (i>5) str=str.substring(0, str.length()-1);
			if (i%2!=0) System.out.println(str);			 
		} // end for
		
	}// end main
}// end class 
