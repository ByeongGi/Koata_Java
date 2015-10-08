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
					//config.xml�� �о�ͼ� �ε��س��´�.
					Reader reader =
								Resources.getResourceAsReader("config/config.xml");
					//sqlSessionFactoryBuilder�� ����ؼ� �о�� config.xml��
					//������ �޸𸮿� �÷����� factory��ü�� �����Ѵ�.
					//sqlsessionfactory�� �ᱹ mybatis�� ��簴ü�� �����Ѵ�.
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
