package singletonpatton;
/*
전통적인 Singleton 패턴 구현법
*/
public class SingletonPatton1 {
    private static SingletonPatton1 INSTANCE;

    private SingletonPatton1() {}
    
    public static SingletonPatton1  getInstance(){
        if (INSTANCE ==null) {
            INSTANCE = new SingletonPatton1();
        }
        return INSTANCE;
    }
} // end class of SingletonPatton 
