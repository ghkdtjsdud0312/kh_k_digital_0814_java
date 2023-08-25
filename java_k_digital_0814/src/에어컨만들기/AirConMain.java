package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        int elapsedTime = 0; // 경과 시간을 계산 하기 위한 변수
        boolean isSetTemp = false; // 온도를 변경할 조건인지 판단하는 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 켜시겠습니까? : (yes / no) : ");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true) {
                sleep(1000); // 1000은 1초
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp =true; break; // 1단
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break; // 2단
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break; // 3단
                    default: if(elapsedTime >= 61) isSetTemp =true;
                }
                if(isSetTemp) {
                    if(lgAirCon.isHearter()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1); // 온도가 내려감
                    lgAirCon.airConInfo(); // 화면에 보여주는 부분
                    isSetTemp = false; // 온도 변경 이후 값을 초기화
                    elapsedTime = 0; // 온도 변경 이후 값을 초기화
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
