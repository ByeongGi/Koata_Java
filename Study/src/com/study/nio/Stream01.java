package com.study.nio;

// @author kosta, 2015. 9. 3 , 오후 7:03:02 , Stream01 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김병기","김희정","김뱡기");
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.err.println(name));
    }
}
