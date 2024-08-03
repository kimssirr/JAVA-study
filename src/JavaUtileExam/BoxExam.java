package JavaUtileExam;

public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setOBJ(new Object());
//        Object obj = box.getOBJ();
//
//        box.setOBJ("hello"); //object를 상속받은 모든 클래스 가능
//        String str = (String) box.getOBJ();
//        System.out.println(str);
//
//        box.setOBJ(1);
//        int value = (int)box.getOBJ();
//        System.out.println(value);
        Box<Object> box = new Box<>();
        box.setOBJ(new Object());
        Object obj = box.getOBJ();

        Box<String> box2 = new Box<>();
        box2.setOBJ("hello"); //String만 받을 수 있음
        String str = box2.getOBJ();
        Box<Integer> box3 = new Box();
        box3.setOBJ(12);
        System.out.println(box3.getOBJ());

    }

}
