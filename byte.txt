package IOExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Throwable;

public class ByteExam1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {

            fis = new FileInputStream("src/IOExam/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");
            int readData = -1;
            //FileInputStream과 FileOutputStream을 이용하여, 1바이트씩 읽어들여 1바이트씩 저장
            while((readData = fis.read())!= -1){ //read()메소드는 더이상 읽어들일 것이 없을때 -1을 리턴
                fos.write(readData); }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
