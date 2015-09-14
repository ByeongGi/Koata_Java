package ex1;
public interface Sql_MAPPER {
    /**
    ======== GOGEK TABLE ========
    DEPTNO	NUMBER(3,0)
    DNAME	VARCHAR2(10 BYTE)
    LOC	VARCHAR2(10 BYTE)
     */
    public static final String SELECT_DEPT = "SELECT * FROM DEPT ORDER BY 1 DESC";
    public static final String INSERT_DEPT="INSERT INTO DEPT VALUES ( ? , ? , ?)";
    
   
     /**
    ======== SAWON TABLE ========
    SABUN	NUMBER(3,0)
    SANAME	VARCHAR2(20 BYTE)
    DEPTNO	NUMBER(3,0)
    SAJOB	VARCHAR2(15 BYTE)
    SAPAY	NUMBER(10,0)
    SAHIRE	DATE
    SASEX	CHAR(6 BYTE)
    SAMGR	NUMBER(3,0)
     */
    public static final String SELECT_SAWON = "SELECT * FROM SAWON ORDER BY 1 DESC";
    public static final String INSERT_SAWON="INSERT INTO SAWON VALUES ( ? , ? , ? , ? , ? , ? , ? , ? )";
    
    /**
    ======== GOGEK TABLE ========
    GOBUN	NUMBER(3,0)
    GONAME	VARCHAR2(10 BYTE)
    GOTEL	VARCHAR2(18 BYTE)
    GOJUMIN	CHAR(14 BYTE)
    GODAM	NUMBER(3,0)
     */
    public static final String SELECT_GOGEK= "SELECT * FROM GOGEK ORDER BY 1 DESC";
    public static final String INSERT_GOGEK="INSERT INTO GOGEK VALUES ( ? , ? , ? , ? , ? )";

   
}
