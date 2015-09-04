package ex2;
// @author kosta, 2015. 9. 1 , 오후 2:20:40 , Ex6_BuffedWR 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex6_BuffedWR {
    // 문자 스트림
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("글 작성 :");
        String cont = sc.nextLine();
        FileWriter fw = null;
        BufferedWriter bw = null;
        String path = "C:\\kosta108\\filetest\\cont.txt";
        try {
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(cont);
            bw.newLine(); // 개형 
            bw.flush(); //  버퍼에서 출력후 비움 S
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
            if (fw != null) fw.close();
            if (bw != null) bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
