package exam;

// @author kosta, 2015. 8. 27 , 오전 11:52:49 , ChildA 
public class ChildA extends ParentsHome{
    private String sach;
    public ChildA() {
        System.out.println("자식 A 의 생성자가 호출되었습니다.");
    }
    
    @Override 
    public void operDoor() {
        System.out.println("지문 인식을 한다 ");
        System.out.println("문이 열린다! ");
    }
    
    
}
