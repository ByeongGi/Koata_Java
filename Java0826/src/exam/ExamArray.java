package exam;
// @author kosta, 2015. 8. 26 , 오후 2:16:52 , ExamArray 
public class ExamArray {
    public static void main(String[] args) {
        // 배열의 선언과 생성과 초기화를 한번에 하는 문법 -> 세트로 표현
        String[] scoreVal = {"100", "90", "80","60","50"};
        int[] score = new int[scoreVal.length];
        int i = 0;
        for (String e : scoreVal) {
            score[i] = Integer.parseInt(scoreVal[i]);
            i++;
        }
        for (int e : score) {
            if (e >= 80) {
                System.out.println(e+"☆");
            } else {
                System.out.println(e);
            }
        }
    }
}
