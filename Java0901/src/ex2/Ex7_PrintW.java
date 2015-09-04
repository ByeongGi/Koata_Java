package ex2;
// @author kosta, 2015. 9. 1 , 오후 4:27:31 , Ex7_PrintW 
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ex7_PrintW {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 브릿지 스트림 - 중요한 스트림인 웹에서 날라온 바이트 기반 자료를 -> 문자로 변환하는 브릿지 스트림 메소드 
        String path  ="C:\\kosta108\\filetest\\cont.txt";
        FileInputStream fis = new FileInputStream(path); //  바이트 스트림을 문자기반 스트림으로 전환할때
        BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
        // => InputStreamReader 인 브릿지 스트림에서 변환하여 출력한다.
        String res =null;
        while ((res =br.readLine())!=null) {      // readLine 한줄 단위로 읽어낸다.      
            System.out.println(res);
        }
        fis.close();
        // 스캐너는 브릿지가 필요없다.
        Scanner sc = new Scanner(new FileReader(path));
        while (sc.hasNext()) {
            String next = sc.nextLine();
            System.out.print(next);
        }
        sc.close();
    }
}
