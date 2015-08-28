package com.lec.java02;
// @author kosta, 2015. 8. 24 , 오후 9:13:16 , JoinExample 
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        
        try {
            sumThread.join(); // sumThread 가 전부다 실행되고 나서 
        } catch (Exception e) { // 일시 정지한 메인 쓰레드 다시 시작    
        }
        
        System.out.println("1 ~100 합 :"+sumThread.getSum());
        
    }
}
