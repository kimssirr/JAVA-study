package 파트6;

public class Car{
    String name;
    int number;



    public Car(String name){
        this.name = name;
    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }

    public Car() {
        this("이름없음", 0);
    }
}