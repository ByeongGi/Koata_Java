package proxy;

public class AnotherConcreteDecorato extends ADecorator{
	   public AnotherConcreteDecorato(Interface_MyBusinessObject target) {
		super(target);
	}

	public String doExecute(String in) {
           System.out.println("AnotherConcreteDecorator: Going to execute method : doExecute");
           // 파라미터 값을 변경해서 원본 비즈니스 객체에 전달
           in = in + " Modified by AnotherConcreteDecorator"; 
           String ret = target.doExecute(in);
           System.out.println("AnotherConcreteDecorator: After execute method : doExecute");
           return ret;
       }
}
