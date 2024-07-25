package 파트8;

public interface TV {
    public int MAX_VOLUME = 100;
    public int MIN_VALUE = 0;
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
