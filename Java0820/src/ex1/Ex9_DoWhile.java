package ex1;
// @author kosta, 2015. 8. 20 , 오후 5:36:52 , Ex9_DoWhile 
public class Ex9_DoWhile {
    public static void main(String[] args) {
        int su = 5;
        String str ="Java Book";
        /*
            while(su-- >10){
        
            }
        */
        do {  // while 문의 조건과 상관없이 일단 무조건 한번은 수행하는 반복문
              // 그 이후 조건 참조해서 반복한다 
            System.out.println(str);
        } while (su-- >10 );
    } // end main
}// end class
