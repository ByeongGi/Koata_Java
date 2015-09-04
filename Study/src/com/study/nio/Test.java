package com.study.nio;

// @author kosta, 2015. 9. 3 , 오후 7:14:02 , Test 

import java.util.ArrayList;

public class Test<T> {
    public static void main(String[] args) {
       String regExpStr = "^a.c$";
  
        String[] strArr = {"abc", "acc", "adc", "aec", "afc", "agc", "ahc", "aiic"};

        for(String str : strArr) {
        System.out.println("[" + str + "] : " + str.matches(regExpStr));
        }
    }
}
