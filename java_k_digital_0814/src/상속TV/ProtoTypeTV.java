package 상속TV;

public class ProtoTypeTV {
    boolean isPower; // 전원값 저장
    int channel; // 채널 정보 저장
    int volume; // 볼륨 값 저장

    public ProtoTypeTV() { // 기본 생성자 초기하기
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    // 생성자 오버로딩(새로운 것을 추가 하는 것)
    public ProtoTypeTV(boolean isPower, int channel, int volume) { // 메소드 오버로딩
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int ch) { // 채널 설정 기능 만들기
        if(ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
