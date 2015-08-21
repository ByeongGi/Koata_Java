package exam;
// @author kosta, 2015. 8. 21 , 오전 11:41:46 , RoboDog 
import ex1.*;
public class MyRoboDog 
{
    boolean power; // ture : 전원을 켠값 / false 전원을 끈값
    int status; // - 3 :짓다 , 4: 눕다, 5: 달린다.     
    public void powerHandler(int num){
        if (num==1) {
            power=true;
            System.out.println("로봇 전원이 켜졌습니다.");
        } else if (num==2){
            System.out.println("로봇 전원을 끕니다.");
            System.exit(0);
        }
    } // end powerHandler()
    public void statusHandler(int num){
        if (!power) {
            System.out.println("로봇이 꺼져있습니다.");
        } else if(num==3) {
            System.out.println("로봇이 짓습니다.");
        } else if (num==4){
            System.out.println("로봇이 눕다.");
        } else if (num==5){
            System.out.println("로봇이 달린다.");
        } else if (num!=3&&num!=4&&num!=5){
            System.out.println("잘못된 입력입니다.");
        }
    } // end powerHandler()
} // end class 
