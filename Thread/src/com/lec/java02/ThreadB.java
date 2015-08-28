package com.lec.java02;
// @author kosta, 2015. 8. 24 , 오후 8:31:39 , ThreadB 
public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {            
            if (work) {
                System.out.println("ThreadB 작업 내용");
            } else{
                Thread.yield();
            }
        }
     System.out.println("ThreadB 종료 ");
    }
    
} // end calss of ThreadB
