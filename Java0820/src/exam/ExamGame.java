package exam;
// @author kosta, 2015. 8. 20 , 오후 2:31:41 , ExamGame 
import java.text.SimpleDateFormat;
import java.util.Scanner;
/*
Math.Random
Scanner
While , swich ,if , break , label ....
홀짝 게임 해서 10 번이상 하면 
점수를 내고 
*/
public class ExamGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int total = 0; // 총 실행한 게임수
        int winConut=0; // 총 이긴 횟수 
        
        // ========================= 사용자 메뉴 UI ========================== 
        exit:while (true) 
        {
            System.out.println(" 1. 홀 2. 짝 3. 종료 ");
            int num = Integer.parseInt(sc.nextLine()); // 사용자로부터 입력
            boolean res=false;
            switch(num)
            {
                case 1:
                    System.out.println("홀을 선택했습니다.");  
                    ++total;
                    res=outCome(num);
                    if(res){
                        System.out.println("You win");
                        ++winConut;
                    }else {
                        System.out.println("You lose");
                    }
                    break;
                case 2:
                    System.out.println("짝을 선택했습니다."); 
                    ++total;
                     res =outCome(num);
                     if(res){
                        System.out.println("You win");
                        ++winConut;
                    }else {
                        System.out.println("You lose");
                    }
                    break;
                case 3:
                    displayResult(total,winConut);
                    break exit;
                
            } // end swich
        } // end while 
    } // end main
    
// ============================= 메소드 선언부  ===============================
    
    /**
     * @param total 총 게임횟수
     * @param winConut 총 이긴 횟수 
     *  총 게임 횟수와 총 이긴횟수를 파라미터로 받아서
     *  게임의 결과를 출력하는 메소드 
     */
    private static  void displayResult(int total, int winConut){
                       // 결과 출력창 
                       System.out.println("Total : "+ total);
                       System.out.println("WIN SCORE : "+winConut);
                       System.out.println("LOSE SCORE :"+(total-winConut));
                       System.out.println("승률 :"+(int)(((float)winConut/(float)total)*100)+"%");
                       prizeResult(winConut);
                       
    } // end displayResult()
    
    /**
     * @param winConut 
     * dispaly() 메소드로부터 호출 받아서 
     * 획득한 점수에 따라서 상품에 대한 결과를 출력하는 
     * 메소드
     */
    private static void prizeResult(int winConut){
        if (winConut>=90) 
                       {
                           System.out.println("상품 A ");
                       }else if (winConut>=80) {
                            System.out.println("상품 B ");
                       }else if (winConut>=70) {
                            System.out.println("상품 C ");
                       }else if (winConut<=60){
                           System.out.println("상품 X ");
                       }
                           System.out.println("종료 합니다.");
    } // end prizeResult()
    
    /**
     * @param num 사용자가 선택한 홀 / 짝을 파라미터로 받음 
     * @return 사용자의 승패를 결과에 따른 결과를 반환
     * 랜덤의 값을 발생시켜 홀수 짝수의 따른 일치여부로 승패 결과를
     * 처리해주는 메소드 
     */
    private static boolean outCome(int num){
          boolean res=false;
          int cpuNum=(int) ((Math.random()*10) + 1); // 난수 발생 1<= Random <11
          System.out.println("CPU 난수: "+ cpuNum);
          if(num==1) res=cpuNum%2!=0; // 홀수  
          if(num==2)res=cpuNum%2==0; // 짝수  
        return res;
    
    } // end outCome()
} // end class 
