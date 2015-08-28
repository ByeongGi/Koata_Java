package exam;

// @author kosta, 2015. 8. 27 , 오후 4:25:26 , TeamMain 
// 문 1: DrawTeam 을 추상 클래스로 설계
// 문 2: 추상 클래스 설계 - 유닛 
// 테란 - 마린 , 고스트 , 메딕 
// 프로토스 - 질럿, 드라곤, 캐리어
// 저그 - 저글링, 히드라, 럴커
public class TeamMain {
    public static void main(String[] args) {
        DrawTeam[] dt = new DrawTeam[2];
        dt[0] = new CirCleTeam();
        dt[1] = new RectTeam();
        for (DrawTeam d : dt) {
            d.drawSomething(100, 100.1f, 3.14f);
        }
        
    }
}
