package IOExam;
//���ڿ��� txt���Ͽ� ���

import java.io.*;

public class CharIOExam{
    public static void main(String[]args){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("data.txt"));
            System.out.println("�ȳ��ϼ���. PrintWriter�Դϴ�.");
            String line = "�ȳ��ϼ���. PrintWriter�Դϴ�.";

            pw.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            pw.close();
        }
        }


    }
