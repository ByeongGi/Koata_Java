package ocp;
// 하나의 부모 클래스형의 참조변수로 여러 (구현된)자식클래스의 자원에 접근하여 사용할수 있다.
// 하나의 클래스로 여러객체를 생성하고 접근하여 자원을 사용할수 있는것이다 .
public class OCP {
    InterfaceA a;
   
    public void tes(InterfaceA a){
        this.a = a;
        if (a instanceof A1) {
        A1 a1 =(A1) a;
        a1.testA();    
        } else if (a instanceof A2) {
        A2 a2 =(A2) a;
        a2.testB();
            
        } else if (a instanceof A3) {
        A3 a3 =(A3) a;
        a3.testC();    
        }
    }
    public static void main(String[] args) {
        OCP ocp = new OCP();
        InterfaceA a= new A1();
        ocp.tes(a);
        
        InterfaceA b = new A2();
        ocp.tes(b);
        
        InterfaceA c = new A3();
        ocp.tes(c);
        
    }
}
