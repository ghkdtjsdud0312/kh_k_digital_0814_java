package 쓰레드예제2;
import static java.lang.Thread.sleep;
    // 다른 쓰레드의 종료를 기다림(Join())
public class ThreadEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try{
            sumThread.join(100);
            // 값을 안주면 무한대로 sumThread가 작업을 완료할 때까지 기다림, 시간을 주면 시간만큼 기다려줌
            // 현재 메인 쓰레드가 대기상태가 됨
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());
    }
}
class SumThread extends Thread {
    private  long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <=100; i++) {
            sum += 1;
        }
    }
}