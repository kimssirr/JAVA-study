package 파트6;

public class CarExam2{
    public static void main(String args[]){

        Car c1 = new Car("소방차");
        Car c2 = new Car("구급차");
        //Car c3 = new Car(); // 컴파일 오류가 발생합니다.

        System.out.println(c1.name);

        System.out.println(c2.name);
    }
}