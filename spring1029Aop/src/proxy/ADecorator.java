package proxy;

public abstract class ADecorator implements Interface_MyBusinessObject {
	 protected Interface_MyBusinessObject target;
     
     // target은 이 객체가 처리할(decorate) 대상으로서
     // 실제 비즈니스 객체가 대상이 된다.
	 public void setTarget(Interface_MyBusinessObject target_) {
         this.target = target_;
     }
     
     public ADecorator(){}
     
     public ADecorator(Interface_MyBusinessObject target_) {
         setTarget(target_);
     }


}
