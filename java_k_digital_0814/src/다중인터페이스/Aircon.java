package 다중인터페이스;

public interface Aircon {
    int MAX_TEMP = 30; // public final static , 상수여서 대문자로 씀
    int MIN_TEMP = 0;
    void airConON();
    void ariConOFF();
    void setAirConTemp(int tmp);
}
