package exam;
// @author kosta, 2015. 8. 27 , 오후 4:22:44 , RectTeam 
public class RectTeam extends DrawTeam{
    @Override
    public void drawSomething(float a, float b, float c) {
        System.out.println("수당 "+pay);
        System.out.println(a+" 높이와 "+b + "너비의 사각형을 그린다.");
    }
}
