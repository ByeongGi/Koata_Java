package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
		private static SqlSessionFactory factory;
		static{
				try{
					//config.xml을 읽어와서 로드해놓는다.
					Reader reader =
								Resources.getResourceAsReader("config/config.xml");
					//sqlSessionFactoryBuilder를 사용해서 읽어온 config.xml의
					//내용을 메모리에 올려놓고 factory객체로 생성한다.
					//sqlsessionfactory는 결국 mybatis의 모든객체를 관리한다.
					factory = new SqlSessionFactoryBuilder().build(reader);
					reader.close();
				}catch(IOException e){
					e.printStackTrace();
				}
		}
		
		public static SqlSessionFactory getFactory() {
			return factory;
		}
}
