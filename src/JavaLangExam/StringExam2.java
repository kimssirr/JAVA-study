package JavaLangExam;

public class StringExam2 {
    public static void main(String[] args) {
        String str1="";
        for(int i=0; i<50; i++) {
            str1 = str1 + "*";
        }
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer();
        for(int i=0; i<50; i++) {
            str2.append("*");
        }
        System.out.println(str2);
    }
}
