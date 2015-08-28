package ex1;
// @author kosta, 2015. 8. 24 , 오전 9:37:26 , Ex_1_Bank 
public class Ex1_Bank {
     private int pay;
     private  String team;
     private boolean status;
     // property
     public void setPay(int p){
         if (status) { 
             System.out.println("변경할 Pay를 입력하세요!");
         pay=p;
         } else{
             System.exit(0);
         }
     }
     
     public boolean isStatus(){
         return status;
     }
     
     public void passTeam(int a){
        if (a==11) {
            
             status = true;
        } else{
              System.out.println("접근 할수 없습니다. 비밀번호를 다시 입력하세요 ! ");
        }
     }
     public int getPay(){
         return pay;
     }
     public  void setTeam(String t){
         team = t;
     }
     public String getTeam(){
          return team;
     }
} // end clsss of Ex1_Bank
