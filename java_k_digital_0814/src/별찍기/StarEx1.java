package 별찍기;
    // 삼각형 별찍기
    // 입력 받은 수만큼 별찍기
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

import java.util.Scanner;

public class StarEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("별 개수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
