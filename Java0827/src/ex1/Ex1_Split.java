package ex1;
// @author kosta, 2015. 8. 27 , 오전 9:08:48 , Ex1_Split 
public class Ex1_Split {
    public static void main(String[] args) {
        // 의미 없는 공백(whileSpace)를 자원으로 취급한다.
        // StirngTokenzer 는 공백을 자원으로 취급하지 않음
        String str = "Java/Book//★";
        // 구분자를 배열로 반환한다.
        String[] s = str.split("/");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
