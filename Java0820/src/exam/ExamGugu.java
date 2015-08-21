package exam;
// @author kosta, 2015. 8. 20 , 오전 11:02:57 , ExamGugu 
import java.util.Scanner;
public class ExamGugu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("단 입력 : "); 
        int inputNum=Integer.parseInt(sc.nextLine());  
        System.out.println("범위 (1,3,5,7) : ");
        int inputRange=Integer.parseInt(sc.nextLine()); 

//        if (inputRange %2 ==0 || (inputRange <=0 || inputRange > 7)) { // 짝수이면서 0 보다 작고
//            System.out.println("범위입력 오류입니다.");                //  7 보다 큰수 면 종료 
//            System.exit(0);
//        }
//        int startDan= inputNum - inputRange/2;
//        int endDan= inputNum + inputRange/2;
        
        int max =0;
        int min =0;
        if(inputRange==1) {
            max =inputNum;   min =inputNum;
        } else if (inputRange==3){
            max =inputNum+1; min =inputNum-1;
        } else if (inputRange==5){
            max =inputNum+2; min =inputNum-2;
        } else if (inputRange==7){
            max =inputNum+3; min =inputNum-3;
        } else{
            System.out.println("입력 범위 오류입니다.");
            System.exit(0);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = min ; j<= max ; j++) {
                if (i==0) {
                    System.out.print(j+"단"+"\t");
                } else {
                    System.out.print(i+"X"+j+"="+(j*i)+"\t");
                }
            }
            System.out.println("");
        }
    } // end main
} // end calss
