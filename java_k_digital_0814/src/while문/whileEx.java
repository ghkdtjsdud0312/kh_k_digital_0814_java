package while문;

import java.util.Scanner;

// 주어진 조건이 참인 동안 해당 블록{ }을 반복 수행
    // 주로 반복 횟수를 알 수 없는 경우에 사용
public class whileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위해 스캐너 생성
        System.out.print("정수를 입력 하세요 : ");
        int n = sc.nextInt();
        int sum = 0; //합계를 구한 변수를 초기화(지역 변수 : 할당 받을 때 메모리 소비 안 함, 범위를 벗어나면 포멧(자동소멸) )
//        while (n > 0) { // sum = 0, n = 10 ,sum = 0, n = 9 ... -> 반복 되기 떄문에 sum이 초기화 되어야 함
//            sum += n; // sum = sum + n; // 10 9 ...
//            n--; // 입력 받은 값을 1씩 감소 시킴 //9 8 ...

            for(int i = 1; i <= n; i++) { // for(초기식; 조건식; 증감식;)
                sum += i;
        }
        System.out.println("주어진 정수의 합 : " + sum);

    }
}
