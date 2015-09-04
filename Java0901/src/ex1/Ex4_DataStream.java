package ex1;
// @author kosta, 2015. 9. 1 , 오후 1:58:31 , Ex4_DataStream 
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ex4_DataStream {
        // DataStream은 데이터의 자료형까지의 저장하는 2차 스트림!
        // OutputStream은 없으면 만들어준다.
        // append 모드가 있는데 바이트 스트림은 참고로 기억
    public static void main(String[] args) {
        String path = "C:\\kosta108\\filetest\\data.dat";
        DataOutputStream dos = null;
        try {
            dos= new DataOutputStream(new FileOutputStream(path));
            dos.writeBoolean(true);
            dos.writeInt(2000);
            dos.writeChar('A');
            dos.writeDouble(30.5);
            dos.writeUTF("MYTEST");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally{
            try {
                if (dos !=null) dos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        
        
        
        
        
        
        
        
    }
}
