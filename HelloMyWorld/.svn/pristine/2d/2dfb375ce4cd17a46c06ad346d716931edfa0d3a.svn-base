/**
 * 구현 사항:
 * 		
 * 2015.10.XX 
 * @author 자기이름
 */
package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	
	static {
		try {
			// config.xml 을 읽어와서 로드 해놓는다.
			Reader reader = 
			Resources.getResourceAsReader("config/config.xml");
			//SqlSessionFactoryBuilder를 사용해서 읽어온 config.xml의
			//내용을 메모리에 올려 놓고 factory객체로 생성한다.
			//SqlSessionFactory는 결국 MyBatis의 모든 객체를 관리한다.
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// sqlSessionFactory를 반환해주는 메서드로 활용
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
