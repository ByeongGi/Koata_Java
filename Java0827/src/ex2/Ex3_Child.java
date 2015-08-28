package ex2;
// @author kosta, 2015. 8. 27 , 오후 4:10:41 , Ex3_Child 
public class Ex3_Child extends Ex3_Mountain{

    @Override
    public void moveMountain() {
        System.out.println("산을 성공적으로 옮기고 "+getMoney()+"받았다.");
    }

    public static void main(String[] args) {
        Ex3_Mountain em = new Ex3_Child();
        em.moveMountain();
    }
} // end class of Ex3_Child
