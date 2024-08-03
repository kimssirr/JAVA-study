package JavaUtileExam;
//제너릭 사용 가상 클래스
public class Box<E> {
    private E obj;

    public void setOBJ(E obj) {
        this.obj = obj;

    }

    public E getOBJ() {
        return obj;
    }
}
