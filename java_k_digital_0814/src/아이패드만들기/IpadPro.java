package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;
import static 아이패드만들기.Common.*;

public class IpadPro {
    int screen; // 11인치, 12.9인치
    int color; // 스페이스 그레이, 실버
    int memory; // 128GB, 256GB, 512GB, 1TB
    int network; // wi-fi only, wi-fi + cellular
    String name; // 각인 서비스 시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum; // 제품의 일련번호 : 제품의 고유값

    static int cnt = 0; // 클래스 소속의 변수, 몇대가 생산되었는지 확인하는 용도, 즉 클래스가 객체로 만들어진 횟수(static은 메소드영역에 하나만 만들어짐)

    IpadPro(String name) {
        this.name = name;
        Date now = new Date(); // 시간 정보가 넘어옴
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); //연도,월(시간 분과 겹쳐서 대문자로),일
        productDate = sdf.format(now); // 생산한 년/월/일을 가져 옴
        cnt++; //오늘 총 생산 대수
        productDate += cnt; // 문자열에 생산 대수를 이어 붙이기
    }

    boolean coutinueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5) + "ipad pro 구입하기" + "-".repeat(5));
        System.out.println("구입하시려면 yes/ 종료는 quit : ");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("yes")) return true; //구입을 진행 함
        else return false; // 구입을 하지 않음
    }

    // 화면 사이즈 정하기
    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 : [1] 11인치, [2] 12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return; //여기서 끝난다.
            System.out.println("디스플레이스를 다시 선택 하세요 : ");
        }
    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택 : [1] 스페이스그레이, [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
        }
    }

    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 : [1]128GB [2]256GB [3]512GB [4] 1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택 하세요. :");
        }
    }

    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 : [1]wi-fi only [2]wi-fi + cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크을 다시 선택 하세요.");
        }
    }

    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? (yes / no) : ");
        String service = sc.next();
        if (service.equalsIgnoreCase("yes")) {
            System.out.println("이름을 입력하세요 : ");
            name = sc.next();
        }
    }
        void setSerialNum () {
            String screenStr = (screen == 1) ? "11" : "13";
            String[] memStr = {"", "128", "256", "512", "1024"};
            String netStr = (network == 1) ? "W" : "C";
            serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate; //일련번호 생성
        }

        void progressPad() throws InterruptedException {
            int cnt = 0;
            while (true) {
                sleep(300); // 예외처리로 while문에 Sleep을 쓰면 움직임을 볼 수 있다. 300마일은 0.3초마다 움직임
                cnt++;
                System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%) >> ");
                System.out.print("\r");
                if(cnt >= 100) break;
            }
    }
    void productPad() {
//        final String[] screenType = {"", "11인치", "12.9인치"};
//        final String[] colorType = {"", "스페이스그레이", "실버"};
//        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
//        final String[] netType = {"", "wi-fi only", "wi-fi + cellular"};
        System.out.println("=".repeat(5) + "ipad pro 사양" + "=".repeat(5));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 :" + netType[network]);
        System.out.println("이름 :" + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("=".repeat(40));
        }
}










