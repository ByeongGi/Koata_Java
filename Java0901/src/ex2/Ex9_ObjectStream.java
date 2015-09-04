package ex2;
// @author kosta, 2015. 9. 1 , 오후 5:33:55 , Ex9_ObjectStream 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Ex9_ObjectStream {
    // 직렬화 : Object 스트림을 통해서 직렬화 대상이 되는 객체를 
    // 해당 장치를 oupput 하는 것을 말한다.
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // 2차 스트림 
        String path  ="C:\\kosta108\\filetest\\cont.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        // 전송할 객체를 생성 
        Member m = new Member();
        m.setName("김길동");
        m.setPay(5000);
        // 직렬화 분해 
        oos.writeObject(m);
        oos.close();
        
        // 이제 읽어보자 : 역직렬화 과정(조립)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        m=(Member) ois.readObject();
        String name=m.getName();
        int pay=m.getPay();
       
        System.out.println(name);
        System.out.println(pay);
    }
}
