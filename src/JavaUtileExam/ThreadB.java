package JavaUtileExam;

public class ThreadB extends Thread{
    // 해당 쓰레드가 실행되면 자기 자신의 모니터링 락을 획득
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<5 ; i++){
                System.out.println(i + "를 더합니다.");
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //notify()메소드를 호출하여 wait하고 있는 쓰레드를 깨움
            notify();
        }
    }
}