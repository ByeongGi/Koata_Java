package com.study.io.java01;

// @author kosta, 2015. 8. 31 , 오후 9:39:05 , IOClass02 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOClass02 {

    public static void main(String[] args) {
        System.out.println("BufferedInputStream, BufferedOutputStream");

        InputStream in = null;
        BufferedInputStream bin = null;
        OutputStream out = null;
        BufferedOutputStream bout = null;
        try {
            in = new FileInputStream("temp/big_text.txt");
            bin = new BufferedInputStream(in);

            out = new FileOutputStream("temp/copy_big_text.txt");
            bout = new BufferedOutputStream(out);

            int dataRead;
            int bytesCopied = 0;

            long startTime = System.currentTimeMillis();
            while (true) {
                dataRead = bin.read();
                if (dataRead == -1) { // Stream 끝
                    break; // while 종료
                } // end if

                bout.write(dataRead);
                bytesCopied++;

            } // end while
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println("전체 복사한 바이트: " + bytesCopied);
            System.out.println("경과 시간(ms): " + elapsedTime);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (bin != null) {
                    bin.close();
                } // end if
                // bin을 close하면, bin을 만든 in도 함께 close됨

                if (bout != null) {
                    bout.close();
                }
				// bout을 close하면, bout을 만든 out도 함께 close됨

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } // end finally

    } // end main()
}
