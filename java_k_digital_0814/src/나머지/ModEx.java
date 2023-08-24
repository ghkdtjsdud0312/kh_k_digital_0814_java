package 나머지;
    // 10개의 수를 입력 받은 뒤, 이를 42로 나눈 나머지를 구함
    // 나머지를 구한 다음 서로 다른 값이 몇개 인지 구하는 문제
    // 숫자 10개를 연속으로 입력 받음
import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        int[] arr = new int[42]; // 42로 나눈 나머지 값을 다 집어 넣은 것
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        int input; // 입력 받은 값

        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 : ");
        for(int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1; // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for(int val : arr) cnt += val;
        System.out.println(cnt);
    }
}
