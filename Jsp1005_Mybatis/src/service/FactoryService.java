package service;
/*
 *  fatoryService -> SqlSessionFactory를 반환하는 클래스 
 * 
 * 
 */
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	
	static{
		try {
			// config-mybatis.xml 를 읽어와서 로드한다.
			Reader reader = 	
			Resources.getResourceAsReader("config/config-mybatis.xml");
			// SqlSessionFactoryBuilder 를 사용해서 설정값들을 읽어온후 
			// 의 내용을 메모리에 올려놓고 factory 객체로 생성한다.
			// SqlSessionFactory 는 결국 Mybatis의 모든 객체를 관리한다.
			factory=new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	// SqlSessionFactory 를 반환하는 메소드
	public static SqlSessionFactory getFatory(){
		return factory;
	}
}
