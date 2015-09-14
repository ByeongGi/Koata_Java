package com.lec.java07;

// @author kosta, 2015. 9. 10 , 오후 9:34:56 , AutoSaveDaemonThread 

import com.lec.java06.*;
// @author kosta, 2015. 9. 10 , 오후 9:34:56 , AutoSaveDaemonThread 

public class AutoSaveDaemonThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while (true) {            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                break;
            }
            save();
        }
    
    
    }
    
    
    
}
