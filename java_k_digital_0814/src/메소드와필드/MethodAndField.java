package 메소드와필드;
    // 메소드 : 클래스 내에서 동작에 대한 기능을 구현 하는 것(함수가 클래스 내부에 있으면 메소드로 함)
    // 필드 : 클래스 내에 존재 하면 값을 저장 하는 변수를 의미(상태를 저장)

public class MethodAndField {
    public static void main(String[] args) {
        int result =sum(100, 200);
        System.out.println(result);
    }
    static int sum(int a, int b) {
        return a + b;
    }

}


