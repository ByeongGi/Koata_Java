package ex1;

// @author kosta, 2015. 9. 16 , 오후 3:48:01 , SawonDao 

import conn.MyConn;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SawonDao {
    public ArrayList<SawonVo> getSawonDept(int deptno){
            ArrayList<SawonVo> arList = new ArrayList<>();
        try {
            Connection con = MyConn.getConn();
            // 프로시저를 호출
            CallableStatement cs = con.prepareCall("begin p_sawon( ? , ? ); end;");
            // 입력 파라미터 바인딩
            cs.setInt(1, deptno);
            // 출력 파마리터 바인딩 
            cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet) cs.getObject(2);
            while (rs.next()) {
                SawonVo vo = new SawonVo();
                vo.setSabun(rs.getInt("sabun"));
                vo.setSaname(rs.getString("saname"));
                vo.setDeptno(rs.getInt("deptno"));
                vo.setSajob(rs.getString("sajob"));
                vo.setSahire(rs.getString("sahire"));
                arList.add(vo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return  arList;
    }
    
    public boolean insertSawon(SawonVo vo){
        Connection conn = null;
        CallableStatement cs = null;
        conn= MyConn.getConn();
        boolean res=false;
        try {
            /* BINDING  Variables 
            String  saname 
            int     dno 
            String  sjob 
            int     sapay 
            String  ssex 
        `   */
            
            // 1. PROCEDURE ps_in CALL
            cs = conn.prepareCall("begin ps_in( ? , ? , ? , ? ,? ); end;");
            cs.setString(1, vo.getSaname());
            cs.setInt(2, vo.getDeptno());
            cs.setString(3, vo.getSajob());
            cs.setInt(4, vo.getSapay());
            cs.setString(5, vo.getSasex());
            // 2. CallableStatement - execute() CALL 
            res=cs.execute();
            System.out.println("res "+res);
                    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return res;
    }
}
