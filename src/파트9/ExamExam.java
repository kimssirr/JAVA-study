package 파트9;
//ExceptionExam의 get50thItem메소드를 통해 50번째 값을 리턴하지만 그것보다 배열 크기가 작을 때의 에외처리
public class ExamExam{
    public static void main(String[]args){

        ExceptionExam ex = new ExceptionExam();
        int[] array = new int[40];
        try {
            System.out.println(ex.get50thItem(array));}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위가 50보다 작음."+e.toString());
        }
    }
}