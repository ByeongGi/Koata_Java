package com.lec.java02;
// @author kosta, 2015. 8. 24 , 오후 8:31:09 , ThreadA 
public class ThreadA extends Thread{
    public boolean stop = false; // 종료 플래그
    public boolean work = true;  // 작업 진행 여부 플러그

    @Override
    public void run() {
        while (!stop) {            
            if (work){
                System.out.println("ThreadA 작업 내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료 ");
    }
    
} // end calss of ThreadA
