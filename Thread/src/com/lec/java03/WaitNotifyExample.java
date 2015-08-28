package com.lec.java03;
// @author kosta, 2015. 8. 24 , 오후 9:40:11 , WaitNotifyExample 
public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject =  new WorkObject();
        
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        
        threadA.start();
        threadB.start();
        
    }
}
