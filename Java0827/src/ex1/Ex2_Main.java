package ex1;
// @author kosta, 2015. 8. 27 , 오전 9:40:09 , Ex2_Main 
public class Ex2_Main 
{
    public static void main(String[] args) 
    {
        // Order와 Target은 Has a 관계가 됨.
        Ex2_HasaOrder ref = new Ex2_HasaOrder();
        System.out.println(ref.orderMetheod());
        ref.getHt().targetMethoed(); // target 의 주소 접근해서 메서드를 호출
        
        
    }
}
