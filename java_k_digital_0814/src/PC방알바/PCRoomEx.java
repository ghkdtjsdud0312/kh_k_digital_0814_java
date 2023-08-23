package PC방알바;
    // 인원 수
    // 예약할 좌석 번호
    // 결과는 거절 횟수 출력
import java.util.Scanner;
public class PCRoomEx {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 인원 수를 입력 받음
        for(int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1) rejectCnt++; // 좌석이 이미 차 있는 경우
            else pcRoom[seatNum-1] = 1; // 좌석에 앉을 수 있는 자리
        }
        System.out.println(rejectCnt);
    }
}
