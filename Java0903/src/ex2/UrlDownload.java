package ex2;

// @author kosta, 2015. 9. 3 , 오후 3:50:27 , UrlDownload 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlDownload {
    public static void main(String[] args) throws MalformedURLException {
        Scanner sc = new  Scanner(System.in);
        URL url = null;
        InputStream is= null;
        BufferedInputStream bis= null; 
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        // 1. 주소 입력 
        System.out.println("주소 입력 저장 !  : ");
        String path=sc.nextLine();
        System.out.println(path);
        try {
            url = new URL(path);
            String FileNames[]=url.getFile().split("/");
            String FileName=FileNames[FileNames.length-1];
            File  f = new File("C:\\kosta108\\filetest\\"+FileName);
            System.out.println("파일 경로 : "+f.getName());
            is =url.openStream(); // iuputStream 으로 얻어와서 
            bis  = new BufferedInputStream(is);
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);
            int read = 0;
            while ((read=bis.read())!= -1) {
            bos.write(read);
            }
            bos.flush();
            
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        } finally{
            try {
                if (bis !=null ) bis.close(); 
                if (is !=null ) is.close(); 
                if (fos !=null ) fos.close(); 
                if (bos !=null ) bos.close(); 

            } catch (IOException ex) {
               
            }
        }
        
    }
}
