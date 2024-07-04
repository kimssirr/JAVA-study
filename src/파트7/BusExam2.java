package 파트7;

public class BusExam2 {
    public static void main(String args[]) {
        Car car = new Bus();
        car.run(); //부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다.
        //exam2.ppangppang(); 자식이 가지고 있는 메소드 사용안됨.
        Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환
        bus.run();
        bus.ppangppang();
    }
}
