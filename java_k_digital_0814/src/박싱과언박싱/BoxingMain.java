package 박싱과언박싱;

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12; // 원래 문법 -> 오토 박싱(자동으로 해준다는 의미)
//        Integer num = new Integer(12); // 원래 문법
//        System.out.println(num);

        Character ch = 'x'; // 오토 박싱
        char c = ch; //오토 언박싱(자동으로 빼줌 - 형변환 필요 없음)
        System.out.println(c);
    }
}
