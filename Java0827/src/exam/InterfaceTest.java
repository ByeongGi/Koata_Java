package exam;
// @author kosta, 2015. 8. 27 , 오후 7:22:04 , InterfaceTest 
public interface InterfaceTest {
    public static final int a = 2;
    
    public abstract void test();
    default void test2(){
        System.out.println("fkfkfkfkfk");
    }
    
}
