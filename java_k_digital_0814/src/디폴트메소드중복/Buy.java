package 디폴트메소드중복;

public interface Buy {
    void buy(); // public abstract 자동으로 추가 됨

    default void order() { // 예외적으로 구현부를 가짐
            System.out.println("구매 주문");
    }
}
interface Sell {
    void sell();

    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy,Sell { // 위에 판매 주문 디폴트 있어서 빨간 밑줄 나옴

    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Sell.super.order();
        Buy.super.order();
    }

    @Override
    public void sell() {

    }
}