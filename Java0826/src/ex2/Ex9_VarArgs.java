package ex2;

// @author kosta, 2015. 8. 26 , 오후 4:47:25 , Ex9_VarArgs 
public class Ex9_VarArgs {
    
    // Varargs : 가변 길이 인자 전달 방식
    // 장점 : 메서드 오버로딩을 한번에 해결
    // 단점 : 같은 자료형만 됨
    // JDK 5 ~ 
    public void addMsg(String ...msg){
        for (String msg1 : msg) {
            System.out.print(msg1);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Ex9_VarArgs args1 =  new Ex9_VarArgs();
        args1.addMsg("Hi");
        args1.addMsg("Hi","OK");
        args1.addMsg("Hi","OK");
        args1.addMsg("Hi","OK","OK");
       
    }
}
