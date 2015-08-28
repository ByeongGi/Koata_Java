package ex2;
// @author kosta, 2015. 8. 26 , 오후 4:28:06 , Ex7_ArrayCopy 
public class Ex7_ArrayCopy {
// 배열 복사
/*
    public static void arraycopy (Object src, int srcPos,Object dest, int destPos,int length)
    src : 소스배열
    srcPos : 소스배열의 복사 시작 위치
    dest : 전송체
    destPos : 전송체 자료내의 복사 시작 위치
    length : 복사하는 문자열 시작을 포함하여 복사할 갯수
    */
    
    public static void main(String[] args) {
        byte[] ar1 = {11,22,33,55,66}; // 배열의 크기 5
        byte[] ar2 = new byte[10]; // 배열의 크기 10
        // ar1 의 첫번쨰 배열부터 복사 => ar1 ,0
        // ae2 로 복사하는데 복사될 위치는 3 번째 인덱스부터 복사하겠다. => ar2 , 3
        System.arraycopy(ar1, 0, ar2, 3 , ar1.length);
        
        System.out.println("원본배열");
        for (byte n : ar1) {
            System.out.println(n);
        } System.out.println("-----------------------");
        System.out.println("복사 배열");
        for (byte n : ar2) {
            System.out.println(n);
        }        
    }
}
