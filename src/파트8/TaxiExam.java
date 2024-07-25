package 파트8;

public class TaxiExam{
    public static void main(String []args){
        Taxi taxi = new Taxi();
        taxi.BASE_FARE = 2500;
        Meter taxi2 = new Taxi();
        ((Taxi) taxi2).BASE_FARE = 2500; // 캐스팅 후 접근
    }
}