package IOExam;
//문자열을 txt파일에 출력

import java.io.*;

public class CharIOExam{
    public static void main(String[]args){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("data.txt"));
            System.out.println("안녕하세요. PrintWriter입니다.");
            String line = "안녕하세요. PrintWriter입니다.";

            pw.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            pw.close();
        }
        }


    }
