package ex2;
// @author kosta, 2015. 9. 16 , 오후 6:09:13 , GogekVo 

public class GogekVo {
    /*
     GOBUN	NUMBER(3,0)
     GONAME	VARCHAR2(10 BYTE)
     GOTEL	VARCHAR2(18 BYTE)
     GOJUMIN	CHAR(14 BYTE)
     GODAM	NUMBER(3,0)    
     */

    
    private String goName;
    private String goTel;
    private String GoJumin;
    private int goDam;
    private String goGender;

    public String getGoGender() {
        return goGender;
    }

    public void setGoGender(String goGender) {
        this.goGender = goGender;
    }

  
    public String getGoName() {
        return goName;
    }

    public void setGoName(String goName) {
        this.goName = goName;
    }

    public String getGoTel() {
        return goTel;
    }

    public void setGoTel(String goTel) {
        this.goTel = goTel;
    }

    public String getGoJumin() {
        return GoJumin;
    }

    public void setGoJumin(String GoJumin) {
        this.GoJumin = GoJumin;
    }

    public int getGoDam() {
        return goDam;
    }

    public void setGoDam(int goDam) {
        this.goDam = goDam;
    }

}
