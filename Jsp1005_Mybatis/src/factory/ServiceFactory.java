package factory;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

import service.Service;

public class ServiceFactory {
	private static ServiceFactory factory;
	private Properties properties;
	private ServiceFactory() {
		this.properties = new Properties();
	}
	public static synchronized ServiceFactory getFactory(){
		if (factory == null) {
			factory = new ServiceFactory();
		}
		return factory;	
	}
	
	public Service getAction(String cmd){
		LoadProperties(); // 프로퍼티 객체에 저장된 정보를 갱신
		String rpath=(String) this.properties.get(cmd);  // 특정 경로의 class 주소
		if (rpath == ""|| rpath==null) {
			cmd = "index";
			rpath = properties.getProperty(cmd);
		} 
		Service service =null;
		try {
			Class<Service> ServiceClass = (Class<Service>) Class.forName(rpath);  
			service=ServiceClass.newInstance(); // 생성자 호출후 Service에 저장
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}
		

		System.out.println("Log 3 서비스 리턴 확인 ");
		return service;		
	}
	
	
	
	//  프로퍼티 파일을 로드하는 메소드 
	public Properties LoadProperties() {
		
		String path =ServiceFactory.class.getResource("factoryProperties.properties").getPath();
		System.out.println("Log 0 : 프로퍼티 파일 경로 " + path);
		
		try {
			path = URLDecoder.decode(path, "utf-8");
			this.properties.load(new FileReader(path)); // 파일을 로드함 
	
            
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch(IOException e){
			
		}
		
        return properties; // 로드한 파일을 리턴 
	}
}
