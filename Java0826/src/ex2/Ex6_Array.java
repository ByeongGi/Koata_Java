package ex2;
// @author kosta, 2015. 8. 26 , 오후 4:19:10 , Ex6_Array 
public class Ex6_Array {
// 가변적 길이 배열 : 다차원 배열에 저장되는 2차원 배열들의 길이를
// 다르게 저장함녀서 배열이 생성됨
// 문법 int [][] test 
// test = new int[저장될 1차원 배열의 수 ][비워둠 ];
// 예 ) test = new int[2][];
    public static void main(String[] args) {
    
        int[] t1 = {1, 100};
        int[] t2 = {1000, 2000, 3000};
        int[][] test = new int[2][];
        test[0] = t1; // 가변적 길이를 가진 객체의 주소를 인덱스에 저장
        test[1] = t2;    
        StringBuffer sb = new StringBuffer();
        for (int[] test1 : test) {
            for (int u : test1) {
                sb.append(u).append("\n");
            }
        }
        System.out.println(sb);
       
    }
 } // end class of Ex6_Array
