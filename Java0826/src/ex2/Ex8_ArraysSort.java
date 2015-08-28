package ex2;
// @author kosta, 2015. 8. 26 , 오후 4:39:08 , Ex8_ArraysSort 
import java.util.Arrays;
public class Ex8_ArraysSort {
    private String[] arr ={"X", "Z", "A","B","C"};
    private int[] number = {10, 3, 11, 60, 70, 12};
    
    private Ex8_ArraysSort(){
        // 배열을 정렬
        Arrays.sort(arr);
        for (String arr1 : arr) {
            System.out.print(arr1+"\n");
        } System.out.println("");
        
        Arrays.sort(number);
        for (int n : number) {
            System.out.println(n);
        }
    }
    
    public static void main(String[] args) {
        new Ex8_ArraysSort();
    }
}
