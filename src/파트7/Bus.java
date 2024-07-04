package 파트7;



public class Bus extends Car {
    public Bus() {
        super();
    }
    public Bus(String name) {
        super(name);
    }

    public void run() {
        super.run(); //부모 메소드 호출 가능
        System.out.println("Bus의 run 메소드");
    }
    public void ppangppang(){
        System.out.println("빵빵.");
    }
}
