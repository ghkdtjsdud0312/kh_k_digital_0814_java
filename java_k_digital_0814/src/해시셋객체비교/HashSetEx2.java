package 해시셋객체비교;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001,"유나");
        Member member2 = new Member(1002,"채원");
        Member member3 = new Member(1003,"지수");
        Member member4 = new Member(1003,"카리나");
        // 중복이 아님, 인스턴스 주소가 달라서 HashCode 값이 다르게 나옴
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
        for(Member e : hashSet) e.showMember();
        // 객체 주소가 다르면 같은 값이여도 중복 제거 안되고 그대로 나옴
        // 중복 제거를 하고 싶으면 오버라이딩을 해야 한다.

    }
}
class Member {
    int id; // 식별번호
    String name;
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) { // 형변환 해줘야 함
        if(obj instanceof Member) { //다운캐스팅으로 확인해주기
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
