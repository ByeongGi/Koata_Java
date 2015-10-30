package proxy;

public class DebugConcreteDecorator extends ADecorator {
		
	public DebugConcreteDecorator(Interface_MyBusinessObject target_) {
		super(target_);
	}

	public String doExecute(String in) {
         System.out.println("DebugConcreteDecorator: before method : doExecute ");
         
         String ret = target.doExecute(in);
         System.out.println("DebugConcreteDecorator: after method : doExecute ");
         return ret;
     }
}
