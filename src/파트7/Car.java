package 파트7;



public class Car{
    public int gas;
    String name;
    int number;
    public Car(String name){
        System.out.println(name + " 을 받아들이는 생성자입니다.");
    }
    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }

    public Car() {
        this("이름없음", 0);
    }

    public void run() {
        System.out.println("Car의 run 메소드");
    }
}
