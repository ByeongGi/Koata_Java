package ex1;
// @author kosta, 2015. 8. 24 , 오전 11:25:22 , Ex2_CallByValue 
// CallbyValue - 기본 자료형을 가지고 메소드를 호출할때 사용되는 인자
// 전달방식
public class Ex2_CallByValue {
    public int test(int n){
        n += 10;
        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        Ex2_CallByValue ec= new Ex2_CallByValue();
        int n1 = ec.test(n);
        System.out.println(n+ ","+ n1);
    }
} // end calss of Ex2_CallByValue
