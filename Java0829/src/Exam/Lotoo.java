package Exam;

// @author kosta, 2015. 8. 31 , 오후 4:16:31 , Lotoo 

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class Lotoo {
    public static void main(String[] args) {
        TreeSet<Integer> h1 = new TreeSet<Integer>();
        // 45 - 7
        Random r = new  Random();
            int n = 0;
        ex:while (true) {
            n = r.nextInt(45)+1; // 1 ~45
            h1.add(n);
            if (h1.size()== 7){
                break ex;
            }
        }
        for (Integer h11 : h1) {
            System.out.println("선택한 번호 :"+h11);
        }
        System.out.println("===========================");
        System.out.println("해쉬맵 구현 ");
        HashMap<Integer,Integer> h2 = new HashMap<Integer,Integer>();
        Random r2 = new  Random();
        int n2 = 0;
        int key =0;
        ex:while (true) {
            n2 = r.nextInt(45)+1; // 1 ~45
            h2.put(key,n2);
            if (h2.size()== 7){
                break ex;
            }
            ++key;
        }
        
        for (Map.Entry<Integer, Integer> entrySet : h2.entrySet()) {
            Integer key1 = entrySet.getKey();
            Integer value = entrySet.getValue();
            System.out.println("선택한 key과 Value"+key1 +" : "+value);
            
            
        }
    }
}
