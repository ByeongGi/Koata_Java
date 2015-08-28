package exam;
// @author kosta, 2015. 8. 27 , 오후 4:20:36 , CirCleTeam 
public class CirCleTeam extends DrawTeam{
    @Override
    public void drawSomething(float a, float b, float c) {
        System.out.println("수당 "+pay);
        System.out.println("지름이 "+a +" 원을 그린다.");
        System.out.println("지름이 "+b +" 타원을 그린다.");
        System.out.println("지름이 "+c +" 반원을 그린다.");
    }
}
