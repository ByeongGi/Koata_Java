package ex1.vo;
// @author kosta, 2015. 9. 15 , 오전 10:07:22 , BoardVo 
public class BoardVo {
    // Member Field
    private int num;
    private String sub; 
    private String writer;
    private String pwd; 
    private String cont;
    private String reip;
    private String redate;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getReip() {
        return reip;
    }

    public void setReip(String reip) {
        this.reip = reip;
    }

    public String getRedate() {
        return redate;
    }

    public void setRedate(String redate) {
        this.redate = redate;
    }
    
} // end class BoardVo
