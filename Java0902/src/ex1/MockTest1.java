package ex1;

// @author kosta, 2015. 9. 2 , 오후 3:50:30 , MockTest1 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MockTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        String path = "C";
        Scanner sc = new Scanner(new FileReader(path));
        while(sc.hasNext()){
            list.add(sc.nextLine());
        }
        for (String list1 : list) {
            System.out.println(list1);
        }
        String[] str = list.get(0).split("/");
        System.out.println("문제 1"+str[0]);
        System.out.println("문제 1"+str[0]);
        
    }
}
