package 파트5;
//특정 값만 가져야할 때 쓰는 열거형
public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main (String[] args) {

        enum Gender {
            MALE, FEMALE;
        }

        Gender david;

        david = Gender.MALE;
        david = Gender.FEMALE;

        System.out.println(david);
    }
}
