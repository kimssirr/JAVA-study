package 중급_파트1;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        //System.out.println(sb);
        String str = sb.toString();

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if(sb2 == sb3){
            System.out.println("sb2 == sb3");
        }
        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
    }
}
