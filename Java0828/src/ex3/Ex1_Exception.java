package ex3;
// @author kosta, 2015. 8. 28 , 오후 2:08:03 , Ex1_Exception 
public class Ex1_Exception {
    public static void main(String[] args) {
        // 실행시 발생하는 예외 - Rumtiem Exceotion
        String[] st = {"A","B","C"};
        // 배열의 범위를 넘었을때 발생
        for (int i = 0; i <= st.length; i++) {
            try { // 예외가 발생할수 있는 구문 
            System.out.println(st[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // 예외가 발생했을때 처리할 구문
                System.out.println("범위를 넘어서 연산이 잘못되었다.");
            } catch(Exception e2){
                
            }
            
        }
        
        
    }
}
