package ex1;

// @author kosta, 2015. 8. 21 , 오후 6:14:47 , T_RoBoClass 
public class Teacher_RoBoClass {

    boolean power; // true :전원을 켠값 / false 전원을 끈값
    int status; // //-3 : 짖다 , 4: 눕다, 5: 달린다.
    
    /**
     * @param num 
     * 사용자가 입력한 1 => On ,2 => Off 에 따라서 Power 의 변수값을 변경하고
     * 로봇의 전원 상태를 출력함
     */
    public void powerHandler(int num) { 
        // 값 : 1, 2 ,  power
        if (num == 1) {
            System.out.println("로봇의 전원이 켜졌습니다.");
            power = true;
        } else if (num == 2) {
            System.out.println("로봇의 전원이 꺼졌습니다.");
            power = false;
            System.exit(0);
        }
    }
    /**
     * @param num 
     * 사용자로부터 전원이 켜진상태에서 로봇 강아지의 
     * 동작을 출력하는 메소드이다.
     */
    public void statusHandler(int num) {
        if (!power) {
            System.out.println("전원이 꺼진 상태입니다 전원을 켜주세요.");
            System.exit(0);
        }
        ex:
        while (true) {
            switch (num) {
                case 3:
                    System.out.println("로보멍이 멍멍 하고 짖습니다.");
                    break ex;
                case 4:
                    System.out.println("로보멍이 자리에 눕습니다.");
                    break ex;
                case 5:
                    System.out.println("로보멍이 열심히 달립니다.");
                    break ex;
            }
        }
    } // end statusHandler()
    
} // end class Teacher_RoBoClass
