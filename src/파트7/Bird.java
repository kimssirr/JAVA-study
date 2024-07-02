package 파트7;
//추상 클래스
public abstract class Bird {
    public abstract void sing(); //메서드 중 하나라도 추상이면 Bird는 추상클래스
    public void fly(){
        System.out.println("날다");
    }
}
