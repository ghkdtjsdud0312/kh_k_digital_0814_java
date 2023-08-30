package Vector클래스;

import java.util.List;
import java.util.Vector;

// ArrayList 구조와 메소드가 동일, 동기화가 지원되어서 멀티쓰레드 환경에서 안전함. 하지만 ArrayList 대비 성능이 떨어짐
public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>(); //ArrayList<>,LinkedList<> 같은 값 나옴
        list.add(new NameCard("우영우","yyy@gmail.com","010-1234-5678","변호사"));
        list.add(new NameCard("동그라미","yyy@gmail.com","010-1234-5678","무직"));
        list.add(new NameCard("이준호","yyy@gmail.com","010-1234-5678","회사원"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}
class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}