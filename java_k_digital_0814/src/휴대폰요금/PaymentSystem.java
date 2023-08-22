package 휴대폰요금;

import java.util.Scanner;

// 영식 요금제 : 30초당 10원 (30초 이상이 되면 2통이 됨)
    // 민식 요금제 : 60초당 15원
    // 첫번째 줄에 통화의 횟수(20회 미만), 두번째 줄에 통화당 통화 시간(초단위)
    // 출력은 싼 요금제를 출력 영식 요금제는 Y 60, 민식 요금제는 M 45
    // 총 통화 요금이 같은 경우는 YM 총 통화 요금 표시
public class PaymentSystem {
    public static void main(String[] args) {
        int[] call = new int[20]; // 통화 횟수에 대한 통화 시간을 입력 받기 위한 배열
        int ypay = 0, mpay = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 통화 횟수를 입력 받아 변수에 대입
        for (int i = 0; i < cnt; i++) {
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for(int i = 0; i < cnt; i++) {
            ypay += (call[i] / 30) * 10 + 10; // 기본 한 통화가 있음(걸리면 바로 통화1통 깔고 감)
            mpay += (call[i] / 60) * 15 + 15;
        }
        if(ypay > mpay) {
            System.out.println("M" + mpay);
        }else if(ypay < mpay) {
            System.out.println("Y" + ypay);
        }else{
            System.out.println("YM" + ypay);
        }
            }
            }

