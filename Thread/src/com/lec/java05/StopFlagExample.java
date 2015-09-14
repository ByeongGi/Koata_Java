package com.lec.java05;

// @author kosta, 2015. 9. 10 , 오후 9:11:41 , StopFlagExample 
public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 t = new PrintThread1();
        
        t.start();
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        t.setStop(true);
    }
}
