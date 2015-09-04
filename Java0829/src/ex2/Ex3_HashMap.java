package ex2;
// @author kosta, 2015. 8. 31 , 오후 5:13:28 , Ex3_HashMap 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex3_HashMap {
    public static void main(String[] args) {
        String[] msg = {"AA","BB","CC","AA","AA","DD","EE","FF"};
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        int cnt = 0;
        for (String e : msg) {
            map.put(cnt+1, e);
            cnt++;
        }
        System.out.println("Size :"+map.size());
        // key는 set 구조이기 때문에 중복을 허용하지 않는다.
        Set<Integer> keys = map.keySet();
        // map.get(key) : set 으로 받아서 추출
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
        // 축약형
        // map.entrySet() -> key, Value 추출
        // map.Entry<Integer,String> -> key 와 Value 를 받아올 인터페이스형 자료형
        for (Map.Entry<Integer, String> entrySet : map.entrySet()) {
            Integer key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println("key :"+key);
            System.out.println("Value :"+value);
        }
        
        
        
    }
}
