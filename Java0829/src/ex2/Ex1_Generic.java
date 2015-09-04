package ex2;
// @author kosta, 2015. 8. 31 , 오후 1:59:12 , Ex1_Generic 

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1_Generic {
    // Collection을 Object형으로 사용하지 않고 
    // 전용 객체로 사용하는 개념 
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        // ar.add(new Integer(10));
        // ar.add(10);
        ar.add("Test");
        ar.add("1000");
        ar.add("Ok");
        // 권장 반복문 3
        Iterator<String> it = ar.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        // 향상된 for 문 
        for (String list : ar) {
            System.out.println(list);
        }
        System.out.println("=====================");
        // Integer 전용 ArrayList를 만들고 값을 저장한 후
        // 출력해보시오.
        ArrayList<Integer> ar2= new ArrayList<Integer>();
        ar2.add(new Integer(11));
        ar2.add(new Integer("22"));
        ar2.add(new Integer("22"));
        ar2.add(new Integer("112"));
        ar2.add(new Integer("23131"));
        Iterator<Integer> it2 = ar2.iterator();
        while (it2.hasNext()) {
            Integer next = it2.next();
            System.out.println(next);
        }
        
        for (Integer list2 : ar2) {
            if (list2>=100) System.out.println(list2);
        }
        
        
    }
    
}
