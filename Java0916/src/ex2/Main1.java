package ex2;

// @author kosta, 2015. 9. 16 , 오후 4:00:46 , Main 

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        GogekDao dao = new GogekDao();
        GogekVo vo = new GogekVo();
        // Scanner sc = new Scanner(System.in);
        
//        System.out.println("부서 번호 입력 : ");
//        int deptno = Integer.parseInt(sc.nextLine());
//        ArrayList<SawonVo> ar = dao.getSawonDept(deptno);
//        
//        for (SawonVo ar1 : ar) {
//            System.out.println("사원 번호 : " + ar1.getSabun());
//            System.out.println("부서 번호 : " + ar1.getDeptno());
//            System.out.println("사원 이름 : " + ar1.getSaname());
//            System.out.println("================================");
//        }
        
        
//        vo.setGoName("김병기");
//        vo.setGoJumin("911221-12345");
//        vo.setGoTel("1234-123");
//        vo.setGoDam(2);
//        dao.insert_GO_IN(vo);
         
         vo=dao.select_GO_SHARCH2("캔디");
         System.out.println("고객 이름 : "+vo.getGoName());
         System.out.println("고객 주민 : "+vo.getGoJumin());
         System.out.println("고객 TEL :"+vo.getGoTel());
         System.out.println("담당자 번호 :"+vo.getGoDam());
         System.out.println("성별 "+vo.getGoGender());
         
         
    }
}
