package Exam;

// @author kosta, 2015. 8. 31 , 오전 11:05:31 , GameMethod 
public class GameMethod {
    
    /**
     * 총 게임 횟수와 총 이긴횟수를 파라미터로 받아서
     * 게임의 결과를 출력하는 메소드
     * @param total // 총 게임횟수
     * @param winConut // 총 이긴 횟수 
     */
    public String displayResult(int total, int winConut){
        String res = "";
        // 결과 출력창 
        res += "Total : "+ total +"\n";
        res += "WIN SCORE : "+winConut +"\n";
        res += "LOSE SCORE :"+(total-winConut) +"\n";
        res += "승률 :"+(int)(((float)winConut/(float)total)*100)+"% \n";
         
        return res;
    } // end displayResult()
    
    /**
     * 획득한 점수에 따라서 상품에 대한 결과를 출력하는 메소드
     * @param winConut // 총 이긴 횟수 
     * dispaly() 메소드로부터 호출 받아서 
     */
    public String prizeResult(int winConut)
    {   String res ="타실 상품은 ? \n";
        if (winConut>=90) 
        {
            res ="상품 A \n";
        }else if (winConut>=80) {
            res ="상품 B  \n ";
        }else if (winConut>=70) {
            res ="상품 C \n ";
        }else if (winConut<=60){
            res ="상품 D \n";
        }
        System.out.println("종료 합니다.");
        return res;
    } // end prizeResult()
    
    /**
     * 랜덤의 값을 발생시켜 홀수 짝수의 따른 일치여부로 승패 결과를
     * 처리해주는 메소드 
     * 난수 발생 범위 :(1<= Random <11)
     * @param num 사용자가 선택한 홀 / 짝을 파라미터로 받음 
     * @return 사용자의 승패를 결과에 따른 결과를 반환
     */
    public boolean outCome(int num)
    {
          boolean res=false;
          int cpuNum=(int) ((Math.random()*10) + 1); 
          System.out.println("CPU 난수: "+ cpuNum);
          if(num==1) res=cpuNum%2!=0; // 홀수  
          if(num==2)res=cpuNum%2==0; // 짝수  
        return res;
    } // end outCome()
    
}
