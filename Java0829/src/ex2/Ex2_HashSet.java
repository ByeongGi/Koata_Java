package ex2;
// @author kosta, 2015. 8. 31 , 오후 4:00:48 , Ex2_HashSet 
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Ex2_HashSet {
// Set 구조는 중복을 허용하지 않는다.    
// 중복을 제거하면서 반복자
// 향상된 for문을 사용하면 정렬이 보장 
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<String>();
        
        h1.add("C");
        h1.add("Atest");
        h1.add("Atest");
        h1.add("A");
        h1.add("B");
        System.out.println("크기 : "+h1.size());
        Iterator<String> it = h1.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("===============");
        
        HashSet<Integer> h2 = new HashSet<Integer>();
        h2.add(10);
        h2.add(20);
        h2.add(99);
        h2.add(1);
        h2.add(2);
        for (Integer h21 : h2) {
            System.out.println(h21);
        }
        System.out.println("================");
        TreeSet<Integer> h3 = new TreeSet<Integer>(); // 정수일떄만 내림 차순이 정렬됨
        h3.add(10);
        h3.add(20);
        h3.add(30);
        h3.add(40);
        h3.add(10);
        h3.add(67);
        for (Integer h31 : h3) {
            System.out.println(h31);
        }
        
    }
}
