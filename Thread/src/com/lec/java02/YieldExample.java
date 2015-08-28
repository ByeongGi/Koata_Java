package com.lec.java02;
// @author kosta, 2015. 8. 24 , 오후 8:40:20 , YieldExample 
public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        
        threadA.start();
        threadB.start();
        
        try {Thread.sleep(3000);} catch (Exception e) {}
        threadA.work = false; // ThreadB 실행 
        
        try {Thread.sleep(3000);} catch (Exception e) {}
        threadA.work = true; // ThreadA , ThreadB 실행 
        
        try {Thread.sleep(3000);} catch (Exception e) {}
        threadA.stop =true;
        threadB.stop =true;
        
        
        
    } // end main
} // end calss 
