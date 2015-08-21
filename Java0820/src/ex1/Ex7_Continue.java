package ex1;
// @author kosta, 2015. 8. 20 , 오후 5:19:08 , Ex7_Continue 
public class Ex7_Continue {
    // continue : 반복문 내에서 사용되며 어느 특정 문장이나
    // 여러 문장들을 건너뛰고자 할때 사용
    // break는 반복문을 빠져 나오지만 continue 문은 이하의 문장을 수행하지 않고
    // 1  증가 되어 반복문의 조건을 검사한다.
    public static void main(String[] args) {
        // 아래 소스에서 홀수만 출력하도록 변경해 보시오.
        for (int i = 0; i < 10; i++) {
            if (i%2==0) continue;
            System.out.println("i값 "+i);
        } // end for
    } // end main
} // end class
