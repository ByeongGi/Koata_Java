package ex1;
// @author kosta, 2015. 9. 1 , 오전 10:52:35 , Ex2_File 
import java.io.File;
public class Ex2_File {
    public static void main(String[] args) {
        File f = new File("C:\\kosta108");
        System.out.println("파일 인지 ? "+f.isFile());
        System.out.println("디렉토리 인지 ? "+f.isDirectory());
        String[] list = f.list();
        for (String list1 : list) {
        System.out.println(list1);
            
        }
    } // end main 
} // end class Ex2_File
