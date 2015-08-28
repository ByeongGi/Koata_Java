package exam;

// @author kosta, 2015. 8. 27 , 오전 11:57:57 , Main 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // 부모를기준으로 자식을 생성
        System.out.println("부모를 생성 호출 ");
        ParentsHome ph1 = new ParentsHome();
        ph1.furniture();
        ph1.wallpaper();
        
        System.out.println("자식 객체 생성 ");
        ChildA A  = new ChildA();
        ChildB B  = new ChildB();
        
        System.out.println("======== A ========");
        A.operDoor();
        A.furniture();
        A.wallpaper();
        
        System.out.println("======== B ========");
        B.operDoor();
        B.furniture();
        B.wallpaper();
        // 문제 2: for 문 으로 출력하고 싶다. wallPaper(), doorkey()
        // childChrome 라는 자식 클래스가 생기더라도 
        // 위에 for문은 코드의 변화 없이 childChome() 의 재정의된
        // 두 메소드를 호출하도록 구현하시오 
        
        
        ParentsHome[] phs =  new ParentsHome[3];
        phs[0] = new ChildA();
        phs[1] = new ChildB();
        phs[2] = new ParentsHome();
        for (ParentsHome ph : phs) {
            ph.operDoor();
        }
        
        ArrayList<ParentsHome>  arrayList = new ArrayList<ParentsHome>();
        arrayList.add(new ChildB());
        arrayList.add(new ChildA());
        
      
        for (ParentsHome arrayList1 : arrayList) {
            arrayList1.operDoor();
        }
        
    }
}
