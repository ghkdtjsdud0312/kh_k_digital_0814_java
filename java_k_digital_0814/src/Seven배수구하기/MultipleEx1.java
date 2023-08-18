package Seven배수구하기;
    // 1 ~ 1000 사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력하기
import java.util.Scanner;
public class MultipleEx1 {
    public static void main(String[] args) {
        // for 반복문으로 1 ~ 1000 사이 반복 수행
        // 조건문의 내부 조건으로 값이 7로 나누어서 나머지가 0이면 출력
        // 10개씩 출력 이후 줄 바꿈이 필요

//        for (int i = 1; i <= 1000; i++) {
//            if (i % 7 == 0) {
//                System.out.printf("%5d", i);
//                if (i % 70 == 0) System.out.println();
//            }
//        }

        int cnt = 0;
        for(int i = 7; i <= 1000; i+=7) {
            cnt++;
            System.out.printf("%5d", i);
            if(cnt == 10) {
                System.out.println();
                cnt = 0;
            }
        }
            }
        }