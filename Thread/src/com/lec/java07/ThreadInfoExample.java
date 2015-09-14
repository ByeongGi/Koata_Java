package com.lec.java07;
// @author kosta, 2015. 9. 10 , 오후 9:41:30 , ThreadInfoExample 

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveDaemonThread autoSaveDaemonThread = new AutoSaveDaemonThread();
        autoSaveDaemonThread.setName("autoSaveDaemonThread");
        autoSaveDaemonThread.setDaemon(true);
        autoSaveDaemonThread.start();
        
        
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads) {
            System.out.println("Name : "+thread.getName()+" "+ ( (thread.isDaemon()) ? "(데몬)":"(주)") );
            System.out.println("\t"+"소속그룹"+thread.getThreadGroup().getName());
            System.out.println("");
            
            
        }
        
    }
}
