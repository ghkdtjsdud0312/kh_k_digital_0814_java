package 예외처리세번째;
// NullPointerException(NPE) : java에서 발생하는 대표적인 런타임 에러 입니다. 객체가 없는 경우에 발생 합니다.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
            if(test != null) {
                String testStr = test.name; // 내용이 없음
                System.out.println(testStr);
            } else {
                System.out.println("test가 null 입니다.");
            }
    }
}
class Test {
    String name = "곰돌이사육사";
}
