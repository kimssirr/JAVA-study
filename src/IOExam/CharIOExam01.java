package IOExam;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class CharIOExam01 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Ű����� �Է¹��� ���ڿ��� �����ϱ� ���� line������ ����
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //�ֿܼ� ���
        System.out.println(line);
    }
}
