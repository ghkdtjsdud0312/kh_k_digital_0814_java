package Object클래스;
    // toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
    // 클래스이름@해시코드(객체의 메모리 주소를 이용해 해시 코드 생성)
    //  - 객체가 hash function에 들어가서 해시코드 생성(하나의 고유값을 만들어줌), 역추적불가능
    // toString() 메소드는 오버라이딩해서 사용 가능하며 String, Integer의 경우에는 오버라이딩 되어있음
public class ObjextClass {
    public static void main(String[] args) {
        Car car01 = new Car();
//        Car car02 = new Car();
//        System.out.println(car01.toString());
//        System.out.println(car02.toString());
//        String test = "곰돌이 사육사";
//        Integer test2 = 2300;
//        int test3 = 4500;
//        System.out.println(test); //오버라이딩 되어있어서 사용가능
//        System.out.println(test2); //toString() 생략가능
//        System.out.println(test3);
        Car car02 = car01;
        // equals()메소드 : 인스턴스를 매개변수로 전달 받는 참조변수와 비교하여 그 결과를 반환
        System.out.println(car01.equals(car02));
    }
}

class Car {

}