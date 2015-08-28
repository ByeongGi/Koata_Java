package ex3;
// @author kosta, 2015. 8. 25 , 오후 4:37:48 , StringBuffer 
public class StringBufferTest {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        String str =null;
        //StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            str += "test";
            // sb.append("test");
        }
        long ed =System.currentTimeMillis();
        System.out.println((ed-st));
    }
} // end class of StringBufferTest
