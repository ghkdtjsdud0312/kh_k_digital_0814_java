package 매개변수의다형성1;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) { // producr, 컴퓨터, 오디오, 티비 다 들어올 수 있음, 구매에 대한 메소드, 부모클래스의 참조변수로 자식 객체를 접근함
        money -= p.price; // 금액 나감
        bonusPoint += p.bonusPoint; //포인트 적립 올라감
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
