package 파트8;
//정적 클래스 안 메소드
public class InnerExam2{
    static class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String args[]){
        InnerExam2.Cal cal = new InnerExam2.Cal(); //InnerExam2 객체를 만들지 않고도 바로 가능
        cal.plus();
        System.out.println(cal.value);

    }
}