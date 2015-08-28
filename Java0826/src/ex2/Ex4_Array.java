package ex2;
// @author kosta, 2015. 8. 26 , 오후 3:09:01 , Ex4_Array 
public class Ex4_Array {
    // 배열 선언과 생성 방법
    private int[] score= {100, 90, 80}; // 분리가 안됨
    private int[] score2;
    
    public Ex4_Array(){
        score2 = new int[] {100, 90, 80}; // 형식으로 분리됨 . 생성자로 초기화 가능 
    }
    
    public void printArrays(){
        for (int e : score) {
            System.out.print(e +"\t");
        } 
        System.out.println("");
        for (int e : score2) {
           System.out.print(e +"\t");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Ex4_Array e = new Ex4_Array();
        new Ex4_Array().printArrays(); // 일회용 객체 생성 방법
    }
    
} // end class of Ex4_Array
