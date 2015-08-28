package com.lec.java01;
// @author kosta, 2015. 8. 24 , 오후 8:17:36 , Thread 
import java.awt.Toolkit;
public class SleepExample {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        
        for (int i = 0; i < 10; i++) {
        t.beep();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        
        }
    }
} // end class of SleepExample
