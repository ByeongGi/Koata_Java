package com.lec.java03;
// @author kosta, 2015. 8. 24 , 오후 9:25:33 , WorkObject 
public class WorkObject {
    public synchronized  void methodA(){
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify(); // 일시정지 상태 쓰레드를 실행 대기로 만듬 
        try {
            wait(); // 쓰레드를 일시 대기 상태로 만듬 
        } catch (Exception e) {
        }
    } // end methodA
    
    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (Exception e) {
        }
    } // end methoedB
} // end class of WorkObject`
