package ex1;
// @author kosta, 2015. 8. 20 , 오후 5:12:13 , Ex6_Break 
public class Ex6_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if ( j==3) {
                    break; // 가장 가까운 상위 로컬 블록 영역의 for이 브레이크가 걸린다.
                }
            System.out.println("i값 :"+i  + " j값 :" +j);
            }
        } // end for
    } // end main
} // end class 
