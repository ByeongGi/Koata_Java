package ex1;
// @author kosta, 2015. 9. 1 , 오후 2:12:30 , Ex5_DataInput 
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ex5_DataInput {
    public static void main(String[] args) {
        DataInputStream dis= null;
        String path = "C:\\kosta108\\filetest\\data.dat";
        try {
            dis = new DataInputStream(new FileInputStream(path)); 
            System.out.println(dis.readBoolean()); // DataOupPutStream 에 넣은 순서대로 읽어준다 .
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            
        }
    }
} // end class Ex5_DataInput
