public class Method {
    public static void main(String[] args) {

        Method exam = new Method();
        exam.hi();
        exam.cal(2,3);

    }
    public void hi () {
        System.out.println("안녕하세요");
    }

    public void cal ( int a, int b){
        System.out.println("합은" + (a + b));
    }
}

