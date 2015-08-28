package com.lec.java02;
// @author kosta, 2015. 8. 24 , 오후 9:10:48 , SumThread 
public class SumThread extends Thread{
    private long sum;
    
    public long getSum(){
        return sum;
    }
    
    public void setSum(long  sum){
        this.sum=sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
    
    
    }
    
    
    
    
} // end class of SumThread
