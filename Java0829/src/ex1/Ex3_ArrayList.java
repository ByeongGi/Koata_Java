package ex1;
// @author kosta, 2015. 8. 31 , 오후 12:29:03 , Ex3_ArrayList 
import java.util.ArrayList;
public class Ex3_ArrayList {
    public static void main(String[] args) {
        // Vector v = new Vector();

        ArrayList list1 = new ArrayList();
        list1.add(new  String("Test"));
        list1.add("Test");
        list1.add(new Integer("100"));
        list1.add(new  Float("3.14f"));
        list1.add(new Boolean("true"));
        list1.add(new Character('A'));
        System.out.println("ArrrayList의 크기"+list1.size());
        String msg="";
        for (int i = 0; i < list1.size(); i++) {
            
            if ((list1.get(i)) instanceof String) {
                System.out.println("문자열 입니다.");
                System.out.println((list1.get(i)));
            } else if((list1.get(i)) instanceof Integer){
                System.out.println("정수형입니다.");
                System.out.println((list1.get(i)));
            } else if ((list1.get(i)) instanceof Boolean){
                System.out.println("Bolean입니다.");
                System.out.println((list1.get(i)));
            } else if ((list1.get(i)) instanceof Float){
                System.out.println("Float 입니다.");
                System.out.println((list1.get(i)));
            } else if ((list1.get(i)) instanceof Character){
                System.out.println("Character 입니다.");
                System.out.println((list1.get(i)));
            }
        }
    }// end main
} // end class Ex3_ArrayList
