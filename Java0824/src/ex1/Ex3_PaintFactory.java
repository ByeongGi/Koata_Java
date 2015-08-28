package ex1;
// @author kosta, 2015. 8. 24 , 오후 12:19:26 , Ex3_PaintFactory 
public class Ex3_PaintFactory {
    // 페인트 회사 객체는 뭘 알고 있어야 하나 ?
    private Ex3_Home home;
    public void userPaint(Ex3_Home home,String color){ // CallByReference 는
        this.home = home;                               // 객체의 주소값을 인자로 받는.
        // home의 주소에서 색상을 칠하기 위한 Setter 를 호출 
        home.setDoorColor(color);
        // home의 주소에서 money Setter 를 호출
        home.setMoney(home.getMoney() - 10000);   
    } // end userPaint()
} // end class Ex3_PaintFactory
