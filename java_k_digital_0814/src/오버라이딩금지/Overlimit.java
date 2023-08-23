package 오버라이딩금지;
    // final 이라는 키워드를 사용해 메소드 오버라이딩을 금지 시킴
public class Overlimit {
        public static void main(String[] args) {
            SportsCar sportCar = new SportsCar("Ferrari");
            ElectricCar elecCar = new ElectricCar("EV6");
            sportCar.setTurbo(true);
            sportCar.infoCar();
            elecCar.infoCar();
            sportCar.accelerator();
            sportCar.breakPanel();
        }
    }

