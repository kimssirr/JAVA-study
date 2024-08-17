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

            byte[] buffer = new byte[512]; //512byte ��ŭ ����.
            while((readCount = fis.read(buffer))!= -1) { //�ִ� 512byte�� �а�, ���� ����Ʈ ���� readCount�� ����˴ϴ�.
                fos.write(buffer, 0, readCount); //buffer�� [0]���� [readCount]���� fos�� write�Ѵ�
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
