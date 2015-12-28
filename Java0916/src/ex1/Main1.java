package ex1;

// @author kosta, 2015. 9. 16 , 오후 4:00:46 , Main 

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SawonVo vo = new SawonVo();
        SawonDao dao = new SawonDao();
 
        System.out.println("이름 : ");
        vo.setSaname(sc.nextLine());
        System.out.println("부서 번호 :");
        vo.setDeptno(Integer.parseInt(sc.nextLine()));
        System.out.println("직책 :");
        vo.setSajob(sc.nextLine());
        System.out.println("성별 :");
        vo.setSasex(sc.nextLine());
        System.out.println("급여 :");
        vo.setSapay(Integer.parseInt(sc.nextLine()));
        boolean res=dao.insertSawon(vo);

    }
}
