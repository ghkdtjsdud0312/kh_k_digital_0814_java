package 추상클래스2;

public class SmartPhone extends Phone {

    public SmartPhone(String name) { // 부모의 클래스에 생성자를 가지고 있어서 만들어야 함
        super(name); // 부모의 생성자 호출
    }

    @Override
    void call() { // 부모가 만든 추상 메소드를 오버라이드 함
        System.out.println("부모 클래스의 Call() 메소드를 구체화 함, 통화 기능 완성");
    }
    public void internet() { // 새로운 메소드 생성
        System.out.println("인터넷을 검색 합니다.");
    }

}
