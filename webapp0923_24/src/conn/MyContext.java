package conn;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyContext {
	private static DataSource ds;
	static {
		// Context xml 를 읽어오기 위한 객체 
		try {
			InitialContext ctx= new InitialContext();
			// JNDI (JAVA Naming and Directory Interface)
			// 이름으로 찾는 기법 , www.naver.com -> ip 통신(도메인 네이밍 서비스)
			// 이런 방법을 사용해서 context.xml 의 리소스에 접근하여
			// 그 정보를 이용해서 WAS 의 Connection Pool 에 있는 
			// Connection 을 얻어 오기 위한 DataSource 객체를 생성한다.
			// lookup 검색 메소드 
			// java:comp/env 관용구 
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myora");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	// 이제 생성된 DataSource로부터 커넥션을 가져오고 반환 받아놓고 
	// 현재 메소드를 호출할때 Connection 을 돌려주면 됨 ! 
	public static Connection getConn() throws SQLException{
		return ds.getConnection();
	}
	
	
}
