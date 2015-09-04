package ex2;
// @author kosta, 2015. 9. 1 , 오후 5:13:49 , Ex8_PrintW 
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex8_PrintW {
    
    public static void main(String[] args) throws FileNotFoundException {
        String path  ="C:\\kosta108\\filetest\\cont.txt";
        // 브릿지 없이 바로 Writer -> OutputStream 으로 전송
        // new FileOutputStream(path,true: append)
        // new PrintWriter(xx,true) : autoflush : 자동으로 버퍼를 비워줌
        PrintWriter pw = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream(path,true)),true);
        Scanner sc = new Scanner(System.in);
        System.out.println("글 작성");
        String msg = sc.nextLine();
        // 문자열을 한줄 단위로 스트림통해서 전송
        String msg1 = "djdjdjdjdjd";
        pw.println(msg1);
        
    }
}
