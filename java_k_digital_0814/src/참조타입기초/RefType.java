package 참조타입기초;
    // 자바의 데이터 타입은 기본 타입과 참조 타입으로 나누어진다.
    // 기본타입은 정수, 실수, 문자, 논리값 등을 저장하는 타입입니다. (실제 값이 변수에 저장 됨)
    // 참조타입은 객체의 주소를 변수에 저장합니다. (배열, 열거형, 인터페이스, 클래스, 문자열)
public class RefType {
    public static void main(String[] args) {
        // 기본 타입 예제
        int age = 25; //int형으로 만들어진 age라는 변수에 25하는 값을 저장
        double price = 100.5; // double형으로 만들어진 price 변수에 100.5라는 값을 저장

        // 참조 타입 예제
        String name = "곰돌이사육사"; //String형으로 만들어진 name에는 살제 "곰돌이사육사"라는 문자열이 없고 주소가 있음 / 8바이트

//        int unbox = null; //int형의 기본 타입이므로 값을 대입해야 함(내가 가리키고 있는 대상이 없음)->

//        Integer boxedValue = null; //int형에 대한 참조타입 /앞에 대문자면 객체타입 .null과 0 가능
//        int intVulue = boxedValue;
//        System.out.println(intVulue);

        String strVal1 = "나희도"; // 리터럴 상수로 고정 됨
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); //heap 영역에 메모리 공간을 확보 함

        // 참조 변수에서 ==, != (주소가 같은지를 물어보게 됨)
        if(strVal1 == strVal2) { //주소가 같은지 물어 봄
            System.out.println("strVal1과 strVal3는 참조하는 주소가 같음");
        }else {
            System.out.println("strVal1과 strVal3는 참조하는 주소가 다름");
        }
        if(strVal1.equals(strVal2)) { // 포함된 내용, 즉 문자열이 같은 지를 물어 봄
            System.out.println("strVal1과 strVal3의 내용이 같음");

        }
    }
}
