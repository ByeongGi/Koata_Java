package com.lec.java04;
// @author kosta, 2015. 9. 10 , 오후 8:50:10 , ConsumerThread 
public class ConsumerThread extends Thread{
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(currentThread().getName());
            //System.out.println(currentThread().getState());
            String data=dataBox.getDate();
        }
    
    
    }
    
    
}
