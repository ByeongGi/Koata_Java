package singletonpatton;
// @author kosta, 2015. 8. 27 , 오후 9:50:24 , SinglePatten2 
public class SingletonPatten2 {
    private static SingletonPatten2 INSTANCE;
    
    private SingletonPatten2(){}
    
    // 동기화 문제 해결 하지만 속도는 저하됨
    public static synchronized SingletonPatten2 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SingletonPatten2();
        }
        return INSTANCE;
    }
}
