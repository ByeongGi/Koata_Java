package proxy;

public class ProxyTest {
	public static void main(String[] args) {
		   // 원래 비즈니스 객체
	    Interface_MyBusinessObject MyBusinessObject = new Imple_MyBusinessObject();
	    // 비즈니스 객체를 Decorator함
	    Interface_MyBusinessObject wrappedObject =
	    		new AnotherConcreteDecorato( new DebugConcreteDecorator(MyBusinessObject));
	    // wrappedObject를 통해서 원래 객체를 호출
	    wrappedObject.doExecute("Hello World");
		
	}
}
