package ex2;

// @author kosta, 2015. 8. 25 , 오전 11:42:07 , MyMath3 
public class MyMath3 {
    int add(int a, int b){
        System.out.println("int add(int a , int b) -");
        return a+b;
    }
    
    long add(int a,long b){
        System.out.println("int add(int a , long b) -");
        return a+b;
    }
    
    long add(long a,int b){
        System.out.println("int add(int a , long b) -");
        return a+b;
    }
    
    long add(long a,long b){
        System.out.println("int add(int a , long b) -");
        return a+b;
    }
    
    int add(int[] a){
        
        System.out.println("int add(int[] a) -");
        int result= 0;
        for (int i = 0; i < a.length; i++) {
            result +=a[i];
        }
        
        return result;
    }
    
}
