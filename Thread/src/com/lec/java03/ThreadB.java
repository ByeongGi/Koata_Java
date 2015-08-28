package com.lec.java03;
// @author kosta, 2015. 8. 24 , 오후 9:26:01 , ThreadB 
public class ThreadB extends Thread{
    private WorkObject workObject;
    
    public ThreadB(WorkObject workObject){
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
} // end class of ThreadB
