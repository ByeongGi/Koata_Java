package ex1;
// @author kosta, 2015. 9. 1 , 오후 12:36:29 , Ex3Buffed_FileStrem 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_Buffed_FileStrem {
    public static void main(String[] args) {
        String cp1 ="C:\\kosta108\\filetest\\net.zip"; // 원본 
        String cp2 ="C:\\kosta108\\filetest\\net2.zip"; // 사본 
        // 복사 : 파읽을 읽어서 다시 작성하는 개념 
        // FileinputStream 1차 스트림라서 1 바이트씩 출력 
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        
        try {
            fis = new FileInputStream(cp1); // 파일이 존재하지 않을 때 발생 (에러)
            fos = new FileOutputStream(cp2); // 파일이 없으면 새로 작성 
            bis = new BufferedInputStream(fis); // 1차와 연결 
            bos = new BufferedOutputStream(fos);
            int res = 0;
            while ((res = bis.read() )!= -1 ) {     // read() 1바이트씩 int 형으로 담아 리턴             
                bos.write(res); // write(int b)  로 1 바이트씩 출력스트림으로 보낸다.
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
            if (bis!=null) bis.close(); // 내부적으로 flush() 메소드 호출해서 버퍼에 있는 내용을 
            if (bos!=null) bos.close(); // 모두 출력한다.
            
            if (fis!=null) fis.close();
            if (fos!=null) fos.close();
            
            } catch (IOException ex) {
               ex.printStackTrace();
            }
        }
        
         long end  = System.currentTimeMillis();
         System.out.println("시간 "+(end-start));
        
    }
}
