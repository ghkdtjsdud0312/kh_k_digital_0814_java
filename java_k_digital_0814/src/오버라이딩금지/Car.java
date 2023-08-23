package 오버라이딩금지;

public class Car {
    int speed;
    String color;
    String name;
    void accelerator() { // super은 부모 것을 부름, override는 기능은 안하고 문법적으로 나오는 것
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}
class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }

    void accelerator() {
        System.out.println("차의 속도를 200 % 증가 시킵니다.");

    }
    void breakPanel() {
        System.out.println("차의 속도를 200 % 감소 시킵니다.");
    }

    int getSpeed() {
        if(isTurbo) return  speed *= 1.2;
        return speed;
    }
    public boolean isTurbo() {
        return isTurbo;
    }
    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}
class ElectricCar extends Car {
    boolean isAutoDrv;
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    public boolean isAutoDrv() {
        return isAutoDrv;
    }
    public void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);

    }

}
