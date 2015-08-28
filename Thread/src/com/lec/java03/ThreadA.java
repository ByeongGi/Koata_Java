package com.lec.java03;

// @author kosta, 2015. 8. 24 , 오후 9:25:54 , ThreadA 
public class ThreadA extends Thread{
    private WorkObject workObject;
    
    public ThreadA(WorkObject workObject){
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    
    }
} // end class of ThreadA
