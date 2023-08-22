package TV기본예제;

public class TV {
    private boolean isON; //TV 전원
    private  int channel; // 채널
    private  int volume; //볼륨

    TV() { // 기본 셋팅 값
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 :" + volume);
    }
    TV(boolean isON, int ch, int vol) {
        this.isON = isON;
        channel = ch; //this 생략 가능
        volume = vol;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 :" + volume);
    }
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffstr = (isON) ? "ON" : "OFF";
        System.out.println("TV 전원이 " + onOffstr + "되었습니다." );
    }
    public void setChannel(int ch) {
        this.channel = ch;
        if(ch >= 1 && ch <= 999) {
            channel = ch;
            System.out.println("채널을 " + channel + "로 변경하였습니다.");
          }else {
            System.out.println("채널 설정 값이 허용 범위를 벗어났습니다.");
        }

       }
       public void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume =vol;
            System.out.println("볼륨을 " + volume + "변경하였습니다.");
        }
       }
        public void getInfoTV() {
            String onOffstr = (isON) ? "ON" : "OFF";
            System.out.println("==".repeat(5) + "TV 정보" + "=".repeat(5));
            System.out.println("전원 : " + onOffstr);
            System.out.println("볼륨 : " + volume);
            System.out.println("채널 : " + channel);
    }
    }

