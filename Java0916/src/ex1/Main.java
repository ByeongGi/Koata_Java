package ex1;

// @author kosta, 2015. 9. 16 , 오후 4:00:46 , Main 

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SawonVo vo = new SawonVo();
        SawonDao dao = new SawonDao();
         System.out.println("부서 번호 입력 : ");
        int deptno = Integer.parseInt(sc.nextLine());
        ArrayList<SawonVo> ar = dao.getSawonDept(deptno);
        
        for (SawonVo ar1 : ar) {
            System.out.println("사원 번호 : " + ar1.getSabun());
            System.out.println("부서 번호 : " + ar1.getDeptno());
            System.out.println("사원 이름 : " + ar1.getSaname());
            System.out.println("================================");
        }
        
    }
}
