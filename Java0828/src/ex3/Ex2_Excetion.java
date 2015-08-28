package ex3;
// @author kosta, 2015. 8. 28 , 오후 3:24:31 , Ex2_Excetion 
public class Ex2_Excetion {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 컴파일 시 발생 하는 예외 : (일반예외)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
            System.out.println(i);
        }
        
    }
}
