package while문;

import java.util.Scanner;

// 반복 횟수를 알 수 없는 경우 대한 예제
// do~while : 한 번은 무조건 수행하고 조건을 물어봄
public class whileEx2 {
    public static void main(String[] args) {
        int age; // 나이를 입력 받는 변수
        do {
            System.out.print("나이를 입력 하세요 : ");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();

        } while (age <= 0 ||age >= 200);
        System.out.println("입력하신 나이는" + age + "입니다.");
//        Scanner sc = new Scanner(System.in);
//        while (true) { // 무한의 횟수를 반복 하기 위해 조건식을 참으로 만듦(반드시 탈출 문이 필요!)
//            System.out.print("나이를 입력 하세요 : ");
//            age = sc.nextInt(); // 무한으로 반복하다가도 이 구간오면 프로그램 멈춤
//            if(age > 0 && age < 200) break; //1~199 사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘 못 입력 하셨습니다.");
//        }

    }
}
