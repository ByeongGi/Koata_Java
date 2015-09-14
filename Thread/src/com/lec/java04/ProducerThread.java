package com.lec.java04;

// @author kosta, 2015. 9. 10 , 오후 8:47:25 , ProducerThread 
public class ProducerThread extends Thread{
    private DataBox dataBox;

    public ProducerThread(DataBox dataBox) {
        this.dataBox = dataBox; // 공유필드에 저장 
    }
    
    
    
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(currentThread().getName());
            //System.out.println(currentThread().getState());
            String data = "Data-" + i; // 새로운 데이터 저장 
            dataBox.setDate(data);
        }
    
    }
    
}
