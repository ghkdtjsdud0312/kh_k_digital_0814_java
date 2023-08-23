package This에대해서;

public class Car {
    private String model; //자동차 명
    private int year;//출생 연도
    private String color; //색상
    private int maxSpeed;// 최고 속도

    Car() {}
    Car(String model) {
        this(model, 2022, "black", 230); // 다른 생성자를 부를 수 있음
    }

    Car(String model, int year, String color, int speed) { //this 생략 되어 있음
        this.model = model; // this는 생략 가능 한데 구분 해주기 위해 this 사용 해야함  this.model(위에 class Car 가리킴) = model(위에 model 가리킴)
        this.year = year;
        this.color = color;
        maxSpeed= speed; // 이름이 달라서 this 생락 가능
    }
}

