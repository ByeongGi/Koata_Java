package singletonpatton;

// @author kosta, 2015. 8. 27 , 오후 9:56:57 , SingletonPatten3 
public class SingletonPatten3 {
    private static SingletonPatten3 INSTANCE;
    
    private SingletonPatten3(){}
    
    public static SingletonPatten3 getInstance(){
        if (INSTANCE == null) {
           synchronized(SingletonPatten3.class){
               if (INSTANCE == null) {
                   INSTANCE = new SingletonPatten3();
               }
           }
        }
                   return INSTANCE;
    }
    
    
}
