package com.lec.java04;
// @author kosta, 2015. 9. 10 , 오후 8:52:18 , WaitNotifyExample 
public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        DataBox dataBox = new DataBox();
        
        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);
        
        producerThread.start();
        consumerThread.start();
      
    }
}
