package JavaUtileExam;

public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 a = new MyThread2("*");
        MyThread2 b = new MyThread2("-");

        Thread a2 = new Thread(a);
        Thread b2 = new Thread(b);
        a2.start();
        b2.start();
    }
}
