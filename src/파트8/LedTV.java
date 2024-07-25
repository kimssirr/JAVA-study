package 파트8;

public class LedTV implements TV{
    @Override
    public void turnOn() {

    }
//turnOn 다음에 {}까지 해야 메소드 생성이다.
    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨 조정");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널 조정");
    }
}
