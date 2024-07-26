package 파트8;
//익명클래스
public class ActionExam {
    public static void main(String[] args) {
//        Action a = new MyAction();
//        a.exec();
        Action action = new Action() { //이름 없는 객체 생성
            @Override
            public void exec() {
                System.out.println("exec");
            }

        };
        action.exec();
    }
}
