package 파트8;
//메소드 안 클래스, 메소드 안에서 클래스 사용 가능
public class InnerExam3{
    public void exec(){
        class Cal{
            int value = 0;
            public void plus(){
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }


    public static void main(String args[]){
        InnerExam3 t = new InnerExam3();

        t.exec();
    }
}
