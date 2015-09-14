package com.lec.java06;
// @author kosta, 2015. 9. 10 , 오후 9:34:07 , DaemonThread 
public class DaemonThread {
    public static void main(String[] args) {
        AutoSaveDaemonThread autoSaveDaemonThread = new AutoSaveDaemonThread();
        autoSaveDaemonThread.setDaemon(true);
        autoSaveDaemonThread.start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드 종료 ");
    }
}
