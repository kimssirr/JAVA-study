package IOExam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        long startTime = System.currentTimeMillis();
        try {

            fis = new FileInputStream("src/IOExam/ByteExam1.java");
            fos = new FileOutputStream("byte2.txt");
            int readCount = -1;

            byte[] buffer = new byte[512]; //512byte 만큼 읽음.
            while((readCount = fis.read(buffer))!= -1) { //최대 512byte를 읽고, 읽은 바이트 수는 readCount에 저장됩니다.
                fos.write(buffer, 0, readCount); //buffer의 [0]부터 [readCount]까지 fos에 write한다
            }
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
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
