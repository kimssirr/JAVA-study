package 파트7;

public class Truck extends Car{
    public Truck() {
        super("소방차");
        System.out.println("Truck의 기본 생성자입니다.");
    }
    public Truck(String name) {
        super(name);
    }
}

//super("소방차")는 Car 클래스의 Car(String name) 생성자를 호출하기 때문에 해당 생성자가 실행됩니다.
// Car 클래스에 기본 생성자가 없기 때문에 Truck 클래스는 Car 클래스의 유일한 생성자인 Car(String name)을 호출해야 합니다.
