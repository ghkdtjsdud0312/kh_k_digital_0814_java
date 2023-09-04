package 매개변수람다식;

@FunctionalInterface // 함수형 프로그램을 만들기 위한 어노테이션, 내부에 함수가 하나만 존재
interface  MyFuncInterface { // 함수만 넣을 수 없기 때문에 인터페이스 사용, 동작도 안하고 의미 없음
    void method(int x); // 내부에 함수가 하나만 존재
}

@FunctionalInterface // 리턴값이 있는 람다식
interface  MyFuncInterface2 {
    int min(int x, int y);
}

    public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface f1 = x -> { // x는 매개변수 {} 안에는 구현부/ 구현부가 한 줄인 경우는 중괄호 생략 가능
//              // 매개변수가 한개인 경우 () 생략 가능
//            int result = x * 5;
//            System.out.println(result);
//        }; // ;으로 구현부 끝을 알려줌
//        f1.method(10);
        MyFuncInterface2 fi2 = (x, y) ->  x < y ? x : y; // 한줄이면 리턴과 중괄호 생략가능, 한줄짜리 구현부(삼항연산자)
        // 구현부가 한줄인 경우 {} 생략 가능 return 생략
        System.out.println(fi2.min(3,4));
    }
}
