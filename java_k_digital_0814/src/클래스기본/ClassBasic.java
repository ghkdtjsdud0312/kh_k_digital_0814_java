package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        //인스턴스화 함(객체가 만들어짐)
        // 객체없으면null student의 클래스에 참조변수
        // heap메모리에 student 메모리를 늘리는 것(new는 동적할당(런타임))

        s1.setName("곰돌이사육사");
        s1.setAddr("경기도 수원시");
        s1.showInfo();

        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();

        Student s3 = new Student();
        s3.setName("유나");
        s3.setAddr("수원시 팔달구");
        s3.showInfo();
    }
}
