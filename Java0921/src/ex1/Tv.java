package ex1;
// @author kosta, 2015. 8. 21 , 오후 2:38:05 , Tv 
public class Tv 
{
    // 멤버 필드 
    String color;
    boolean power;
    int channel;   
    // 멤버 메소드 
    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
} // end class of Tv 
