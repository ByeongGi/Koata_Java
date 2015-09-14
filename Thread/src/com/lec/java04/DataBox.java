package com.lec.java04;
// @author kosta, 2015. 9. 10 , 오후 8:36:22 , DataBox 

import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBox {
    private String data;
    
    public synchronized String getDate(){
        if (this.data == null ) {
            try {
                wait(); // DATA 객체가 null 이면 소비자 객체는 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String returnValue = data;
        System.out.println("ConsumerThread가 읽은 데이터 " + returnValue );
        data = null; // data 필드를 null 로 만들고 생산자 쓰레드를 실행대기 상태로 만듬
        notify();
        return returnValue;
    }
    
    public synchronized void setDate(String data){
        if (this.data != null) { // data 가 null  아니면 생산자 쓰레드를 일시 정지 시킴 
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(DataBox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터 : "+data);
        notify(); // 필드에 data에 값을 저장하고 소비자 쓰레드를 실행 대기 상태로 만듬. 
        // notify() - > 다른 쓰레드에게 작업을 끝났으니 실행대기하고 있으라고 알림 !!!
        
    }
}
