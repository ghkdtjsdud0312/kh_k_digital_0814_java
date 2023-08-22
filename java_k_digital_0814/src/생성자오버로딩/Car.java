package 생성자오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;

    Car() {} //생성자
    Car(String model) { //매개변수 1개인 생성자
       this.model = model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed,int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
//    Car() {}//default 생성자가 숨어져 있다. / 아무 것도 안하는 생성자

        public void carInfo() {
            System.out.println(company);
            System.out.println(model);
            System.out.println(color);
            System.out.println(speed);
            System.out.println(horsePower);
        }
    }


