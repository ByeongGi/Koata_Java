package exam;

// @author kosta, 2015. 8. 26 , 오후 6:04:23 , Calculator 
public class Calculator {
/*
필드 설계 하는법 
필드 클래스 내부에서 사용할 변수 선언 
또는 외부에서 들어온 매개변수의 값을 저장 
*/

/*
메소드 설계 하는법 
=>  기능(핵심) , 동작 중심의 실행을 염두한 구현 
*/    
    
    
public String plus(int n1,int n2){
    String str = "+ 연산의 ";
    int res = n1 + n2; 
    String result=result(res,str);
    return result;
}

public String minus(int n1,int n2){
    String str = "- 연산의 ";
    int res = n1 - n2; 
    String result=result(res,str);
    return result;
}

public String divide(int n1,int n2){
    String str = "/ 연산의 ";
    int res = n1 / n2; 
    String result=result(res,str);
    return result;
}

public String multiply(int n1,int n2){
    String str = "* 연산의 ";
    int res = n1 * n2; 
    String result=result(res,str);
    return result;
}

private String result(int res,String str){
    return str+" RESULT : " +res;
}
    
    
} // end class of Calculator
