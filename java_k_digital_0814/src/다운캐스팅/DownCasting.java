package 다운캐스팅;

import java.util.ArrayList;

// 상위 클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 다운 캐스팅이라고 함
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>(); // <>안에는 꼭 객체 주소가 와야함, 들어올때마다 메모리공간이 자동으로 늘어난다.
        public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();

        }
        public void addAnimal() {
            aniList.add(new Animal()); //객체가 인스턴스화 됨/여러방에 애니멀이라는 것을 넣은 것
            aniList.add(new Human());
            aniList.add(new Tiger());
            aniList.add(new Eagle());
            for(Animal ani : aniList) {
                ani.move();
            }
        }
        public void testCasting() {
            for(int i = 0; i < aniList.size(); i++) {
                Animal ani = aniList.get(i); // 업캐스팅
                if(ani instanceof Human) { // human 형으로 다운캐스팅 가능 한지 확인
                    Human h = (Human) ani;
                    h.readBook(); // 원래 자기 자신의 클래스에 대한 참조 변수이기 때문에 접근 가능 함
                } else if (ani instanceof Tiger) {
                    Tiger t = (Tiger) ani;
                    t.hunting();
                } else if (ani instanceof Eagle) {
                    Eagle e = (Eagle) ani;
                    e.flying();
                } else {
                    System.out.println("지원되지 않는 행입니다.");
                }
            }
        }
}
