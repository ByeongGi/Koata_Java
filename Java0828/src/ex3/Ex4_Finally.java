package ex3;

// @author kosta, 2015. 8. 28 , 오후 4:05:46 , Ex4_Finally 
public class Ex4_Finally {
    public static void main(String[] args) {
        int[] var = {10,200,30};
        System.out.println("자원 연결");
        try {
            for (int i = 0; i <= var.length; i++) {
                System.out.println(var[i]);
                System.out.println("★");
            }         
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열을 넘었습니다.");
                return;   
        } finally{ // 예외문과 상관없이수행되는 곳 
                System.out.println("자원 해체 "); // 이곳은 자원이 해체되는 곳         
        }   
        
    }
}
