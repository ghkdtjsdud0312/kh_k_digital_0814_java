package 다형성기본;

public class Parent {
        protected  int num; // protected 상속관계(다른패키지에 있는데 연결되어있으면 가능)와 같은 패키지내에서 접근 가능
        public void display() {
            System.out.println("부모 클래스 메소드");
    }
}
