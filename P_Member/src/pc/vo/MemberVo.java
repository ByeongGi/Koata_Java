package pc.vo;
// @author kosta, 2015. 9. 15 , 오후 4:17:22 , MemberVo 
/*
테이블 구조 
create table MemberTable(
MNum number, 
MId varchar2(40) constraint MemberTable_MId_NN not null,
MName varchar2(40) constraint MemberTable_MName_NN not null,
MPwd varchar2(40) constraint MemberTable_MPwd_NN not null,
MAddr varchar2(100) ,
MEamil varchar2(50),
MGender varchar2(10),
MRole char(2) constraint MemberTable_MRoll_NN not null,
MTel varchar2(30),
MRegDate date,

constraint MemberTable_MNum_PK primary key(Mnum),
constraint MemberTable_MId_U

*/
public class MemberVo {             //  DB data 타입 
    private int MNum;               //  number
    private String MId;             //  varchar2(40) constraint MemberTable_MId_NN not null,
    private String MName;           //  varchar2(40) constraint MemberTable_MName_NN not null,
    private String MPwd;            //  varchar2(40) constraint MemberTable_MPwd_NN not null,
    private String MAddr;           //  varchar2(100) 
    private String MEamil;          //  varchar2(50),
    private String MGender;         //  varchar2(10),
    private String MRole;           //  char(2) constraint MemberTable_MRoll_NN not null,
    private String MTel;            //  varchar2(30),
    private String MRegDate;        //  date

    public int getMNum() {
        return MNum;
    }

    public void setMNum(int MNum) {
        this.MNum = MNum;
    }

    public String getMId() {
        return MId;
    }

    public void setMId(String MId) {
        this.MId = MId;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMPwd() {
        return MPwd;
    }

    public void setMPwd(String MPwd) {
        this.MPwd = MPwd;
    }

    public String getMAddr() {
        return MAddr;
    }

    public void setMAddr(String MAddr) {
        this.MAddr = MAddr;
    }

    public String getMEamil() {
        return MEamil;
    }

    public void setMEamil(String MEamil) {
        this.MEamil = MEamil;
    }

    public String getMGender() {
        return MGender;
    }

    public void setMGender(String MGender) {
        this.MGender = MGender;
    }

    public String getMRole() {
        return MRole;
    }

    public void setMRole(String MRole) {
        this.MRole = MRole;
    }

    public String getMTel() {
        return MTel;
    }

    public void setMTel(String MTel) {
        this.MTel = MTel;
    }

    public String getMRegDate() {
        return MRegDate;
    }

    public void setMRegDate(String MRegDate) {
        this.MRegDate = MRegDate;
    }
    
    
}
