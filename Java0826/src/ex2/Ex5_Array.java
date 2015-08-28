package ex2;
// @author kosta, 2015. 8. 26 , 오후 3:19:15 , Ex5_Array 
public class Ex5_Array {
    public static void main(String[] args) {
        // 다차원 배열 : 1차원 이상의 배열을 의미하며 1차원 배일이 여러개가 
        // 모인 것을 다차원 배열이라고 한다.
        
        // 종류 : 고정적 길이 배열 , 가변적 길이 배열
        // 1. 고정적 길이 배열
        // 문법 ) int[][] test;
        // test = new int[저장될 1차원 배열의 수][각 1차원 배열의 길이]
        // test = new int[2][3];
        // (해석) int 형 자원을 3 개 저장할수 있는 1차원 배열 객체 2개를 
        // 가지고 있는 고정적 길이 다차원 배열이다.
        int[][] test = new int[2][3];
        test[0][0]=100; 
        test[0][1]=200; 
        test[0][2]=300;
        // 1 행 초기화 끝 
        
        test[1][0]=1; 
        test[1][1]=2; 
        test[1][2]=3;
        // 2 행 초기화 끝 
        
        // test[i][j]
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.println(test[i][j]);
            }
        }
        System.out.println("======== For ==========");
        // 향상된 for 문 변경하여 출력하시오
        
        for (int[] col : test) { // 다중 배열에 1차원 배열의 자료형
            for (int row : col) { // 1 차원 배열이 가지고 있는 자료형
                System.out.println(row);
            }
        }

    } // end main 
} // end class of Ex5_Array
