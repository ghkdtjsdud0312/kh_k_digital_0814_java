package 추상클래스2;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
