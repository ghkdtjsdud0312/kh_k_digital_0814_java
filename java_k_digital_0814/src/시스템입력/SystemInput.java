package 시스템입력;
// Scanner 클래스를 사용해서 입력 받음
import java.util.Scanner;

public class SystemInput {
        public static void main(String[] args) {
            // 클래스는 설계도면이라고 생각하면 됨
            // sc는 클래스에 대한 변수
            Scanner sc = new Scanner(System.in);
            //클래스의 공간 외에 동적인 메모리공간에 새로운 스캐너를 만들어 달라는 뜻
            // 스캐너에 대한 객체 생성
//            byte a = sc.nextByte(); // byte형 입력을 받아 반환(입력을 받아 넘겨줌)
//            short b = sc.nextShort(); // short형의 입력을 받아 반환
//            int c = sc. nextInt(); // int형의 입력을 받아 반환
//            long d = sc.nextLong(); // long형의 입력을 받아 반환
//            char ch = sc. next().charAt(0); // 문자열을 입력받음. 인덱스에 대한 문자 하나만 추출함.
//                                            // 문자열에서 0번째(첫번째)문자를 추출
//            float e = sc. nextFloat(); // float 형의 입력을 받아 반환
//            double f = sc.nextDouble(); // double형의 입력을 받아 반환
//            String h = sc.next(); //공백 기준으로 입력 받음
//            String i = sc.nextLine(); // 줄바꿈 문자 기준

            System.out.print("이름을 입력 하세요 : ");
            String name = sc.next(); //이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어감
            sc. nextLine(); //버퍼 지우기
            System.out.print("주소를 입력하세요 : ");
            String addr = sc.nextLine(); //줄바꿈이 일어나면 다음 입력으로 넘어감
            System.out.print("성별을 입력하세요 : ");
            char gender = sc.next().charAt(0); //입력 받은 문자열에서 맨앞의 문자 1차 추출
            System.out.print("나이를 입력 하세요 : ");
            int age = sc.nextInt();

            System.out.println("==== 회원 정보 출력 ====");
            System.out.println("이름 : " + name);
            System.out.println("주소 : " + addr);
            System.out.println("성별 : " + gender);
            System.out.println("나이 : " + age);
        }

}
