package ex1;
// @author kosta, 2015. 9. 1 , 오전 10:06:15 , Ex1_File 

import java.io.File;
import java.io.IOException;

public class Ex1_File {
    // File 클래스 : 파일이나 디렉토리 경로를 추상화한 클래스
    // 특정 파일의 크기 . 디렉토리의 내용들을 알고 싶을 때 사용
    public static void main(String[] args)  {
        // C:\kosta108\filetest
        File f = new File("C:\\kosta108\\filetest\\test.txt");
        System.out.println(f.getClass().getName());
        System.out.println("파일이나 디렉토리 유뮤 : "+ f.exists());
        System.out.println("파일인가? "+ f.isFile());
        System.out.println("디렉토리인가? "+f.isDirectory());
        System.out.println("파일의 이름 :"+f.getName());
        System.out.println("파일의 크기는 ? "+f.length());
        System.out.println("파일의 절대 경로 :"+f.getAbsolutePath());
        System.out.println("================================");
        File f2 = new File("C:\\kosta108\\filetest\\test2.txt");
        if (!f2.exists()) {
            try {
                f2.createNewFile(); // 0 바이트짜리 빈 파일
                System.out.println("test2.txt 를 생생합니다 ! ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("파일이 이미 존재합니다."+f.getAbsolutePath()); 
            try {
            Thread.sleep(3000); // 3초후 삭제 
            // 프로그램이 종료 된 이후 삭제 
            } catch (InterruptedException e) {
                
            }
            f2.deleteOnExit();
        }
        
//        int i = 0;
//        while (i<20) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                
//            }
//            i++;
//        }
//        f2.deleteOnExit();
    }
}
