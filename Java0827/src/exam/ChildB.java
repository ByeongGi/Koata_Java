package exam;

// @author kosta, 2015. 8. 27 , 오전 11:52:58 , ChildB 
public class ChildB extends ParentsHome{
    private String tile;
    public ChildB() {
        System.out.println("자식 B 의 생성자 호출 되었습니다.");
    }
    
    @Override
    public void operDoor() {
        System.out.println("현관문 번호키를 입력");
        System.out.println("문이 열린다!!!!");
    }
    
    
}
