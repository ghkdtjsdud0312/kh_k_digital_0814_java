package 예외처리다섯번째;

import java.io.IOException;

// 예외처리 미루기
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
//        test.input(); //  throws IOException을 메인한테 미뤘음 -> try 구문쓰기
        try {
            test.input();
        } catch (IOException e) {
            System.out.println("입력 에러 발생......");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
class IOSample {
    private int num;
    public void input() throws IOException { // 예외처리함 , try-catch문을 여기서 하면 메인에서 안해도 됨
        num = System.in.read(); // -> 문자를 입력 받는 것,throws IOException 예외 처리 필요
    }
    public void output() {
        System.out.println(num);
    }
}