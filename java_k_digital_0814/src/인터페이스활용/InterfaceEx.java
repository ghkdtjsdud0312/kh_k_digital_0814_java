package 인터페이스활용;

public class InterfaceEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // customer 참조 변수를 Buy 인터페이스형에 대입
        buyer.buy();

        Sell seller = customer;
        seller.sell();
        Customer customer2 = (Customer) seller; // 다운 캐스팅(부모형을 자기형으로 바꿈)
        customer2.buy();
        customer2.sell();
    }
}
