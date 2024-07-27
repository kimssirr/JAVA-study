package 파트9;

public class ExceptionExam {
    public int get50thItem(int []array) throws ArrayIndexOutOfBoundsException{
        return  array[49];
    }
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
        int k = i / j;
        System.out.println(k);}
        catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
        }
        finally {
            System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
        }
        System.out.println();
    }
}
