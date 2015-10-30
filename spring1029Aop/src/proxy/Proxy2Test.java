package proxy;

import java.lang.reflect.Proxy;

public class Proxy2Test {
	public static void main(String[] args) {
		  Interface_MyBusinessObject bo = new Imple_MyBusinessObject(); // 실제 비즈니스 객체
		    MyDebugInvocationHandler aMyDebugInvocationHandler = 
		    		new MyDebugInvocationHandler();
		    aMyDebugInvocationHandler.setTarget(bo);
		    
		    Interface_MyBusinessObject proxyObject =
		    		(Interface_MyBusinessObject) Proxy.newProxyInstance // 프록시 객체 생성
		          (Interface_MyBusinessObject.class.getClassLoader(),
		          new Class[] { Interface_MyBusinessObject.class }, // 프록시할 인터페이스
		          aMyDebugInvocationHandler); // InvocationHandler
		    
		    // 프록시 객체 사용
		    System.out.println(proxyObject.doExecute("Hello World"));
	}
}
