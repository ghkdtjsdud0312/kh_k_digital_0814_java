package 에어컨만들기;

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

// 전원 : ON / OFF
    // 온도 설정 기능
    // 현재 온도 표시 기능
    // Cooler ON / OFF
    // Heater ON / OFF
    // 바람 세기 : 1단 / 2단 / 3단
public class AirCon {
       private boolean isPower; // ON / OFF
       private int setTemp; // 온도 설정
       private int currTemp; // 현재 온도
       private boolean isCooler; // 냉방기
       private boolean isHearter; // 난방기
       private int windStep; // 1단, 2단, 3단
        AirCon() {
            // 에어컨의 현재 온도를 보여주기 위한 값
            final int[] MONTHTEMP = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2}; // 달의 평균 온도
            Calendar now = Calendar.getInstance(); // 캘린더는 객체를 못 만들고(new없음) getInstance로 데이터 끌어옴
            int month = now.get(Calendar.MONTH); // 배열의 인덱스와 돟일
            currTemp = MONTHTEMP[month]; // 배열에 설정한 온도 정보를 가져옴
            isPower = false;
            setTemp = 18;
            isCooler = false;
            isHearter = false;
            windStep = 1;
        }
        void airConInfo() {
            String onOffStr = (isPower) ? "ON" : "OFF";
            String heaterStr = (isHearter) ? "ON" : "OFF";
            String coolerStr = (isCooler) ? "ON" : "OFF";
            final String[] windStr = {"", "1단계", "2단계", "3단계"};
            System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
            System.out.println("전원 : " + onOffStr);
            System.out.println("현재 온도 : " + currTemp);
            System.out.println("설정 온도 : " + setTemp);
            System.out.println("히터 : " + heaterStr);
            System.out.println("쿨러 : " + coolerStr);
            System.out.println("바람 세기 : " + windStr[windStep]);
        }
        public void setAirConState() {
            Scanner sc = new Scanner(System.in);
            System.out.println("현재 온도는 " + currTemp + " 입니다.");
            System.out.print("온도를 설정 하세요 : ");
            setTemp = sc.nextInt();
            System.out.println("설정 온도는 " + setTemp + " 입니다.");
            System.out.print("바람 세기를 설정 하세요.(1단/2단/3단) : ");
            windStep = sc.nextInt();
            if(currTemp > setTemp) { // 설정 온도가 현재 온도보다 낮은 상태(더운 상태)
                System.out.println("Cooler가 작동 합니다.");
                isCooler = true;
                isHearter = false;
            } else if(currTemp < setTemp) { // 설정 온도가 현재 온도보다 높은 상태(추운 상태)
                isCooler = false;
                isHearter = true;
            } else {
                isCooler = false;
                isHearter = false;
            }
        }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getWindStep() {
        return windStep;
    }

    public boolean isHearter() {
        return isHearter;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public void setCurrTemp(int n) { // 매개변수의 정수 값을 받아 현재 온도를 변경해줌
        currTemp += n;
    }

    public int getCurrTemp() { // 현재 온도를 읽는 메소드
        return currTemp;
    }

    public int getSetTemp() { // 설정 온도를 읽는 메소드
        return setTemp;
    }
}
