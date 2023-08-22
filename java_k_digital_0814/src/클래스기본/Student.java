package 클래스기본;
    // private를 붙이면 외부입력값(classbasic)에서 숨겨져서 안보임
public class Student {
    //Private 외부에서 해당 필드에 대한 접근 막음
    private int id; //학번, 인스턴스 필드라고 부름
    private String name; //이름
    private int grade; // 학년
    private String addr; // 주소

        //메소드
        public void showInfo() {
        System.out.println(name + "," + addr);
    }
        // setter 메소드(Generate-setter- 고르기)
        public void setName(String name) {
            this.name = name;
        }
        public void setAddr(String addr) {
            this.addr = addr;
        }
    }

