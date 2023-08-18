package 상근이알람;

import java.util.Scanner;

public class AlarmEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 시간과 분을 입력 받기 위한 스캐너 생성
        System.out.print("시간 분 입력 : "); // 시간과 분을 각각 입력 받음
        int hour= sc.nextInt();
        int min= sc.nextInt();
        int totalmin = (hour * 60) + min;
        if(totalmin < 45) { // 45분을 빼야 되므로 시간과 분을 총 몇 분인 환산하고 거기서 45분 빼줌
            totalmin = 24 * 60 + totalmin;  // 계산된 시간이 45분보다 작으면 하루 전날이므로 하루의 시간만큼 더해줌
        }
        totalmin -= 45; // 계산된 시간에서 45를 빼줌
        System.out.println((totalmin / 60) + "시" + (totalmin % 60) + "분"); // 결과를 시간과 분으로 환산해서 출력 해줌
    }
}
