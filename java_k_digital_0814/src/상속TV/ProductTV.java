package 상속TV;

// ProtoTypeTV로 부터 상속을 받아 ProductTV 클래스를 만듦
public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isInternet;

    ProductTV() {
        name = "Smart TV";
    }

    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower) { //없는 것 새로 만듦
        this.isPower = isPower;
    }

    void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) { //없는 것 새로 만듦
            this.volume = vol;
        } else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }

    // 오버라이딩 : 부모에게서 물려 받은 기능을 재정의해서 사용하는 것 -> 채널기능 갯수 수정
    // 오버라이딩이 일어나면 동적바이딩이 일어남 - 부모,자식 것 중 어떤 것을 쓸지 실행 중에 결정됨(런타임)
    @Override //<-어노테이션(상속관계가 있으면 오류 없음/부모가 가지고 있는지 확인해줌)
    public void setChannel(int ch) { //채널 추가로 넣어줌
        if (ch > 1 && ch < 2000) {
            channel = ch;
            System.out.println("채널을 " + channel + "변경 했습니다.");
        } else System.out.println("채널 설정 범위를 벗어 났습니다.");
    }

    // 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분
    public void setChannel(int ch, boolean isInternet) { // 채널 + 인터넷 모드 추가
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if (ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을 " + channel + "변경 했습니다.");
            } else System.out.println("채널 설정 범위를 벗어 났습니다.");
        }
    }
    void viewTV() { //새로운 TV 설계도면만들기
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 :" + isInternet);
    }
}
