package 쓰레드예제1번;
    // 하나의 프로그램 내에서 여러 가지 일을 동시에 수행 하는 것
public class ThMainEx1 {
    public static void main(String[] args) {
        // Thread 클래스 상속 받아서 Thread 생성
        Thread testTh = new CustomThread();
        testTh.start(); // 운영체제한테 시작해달라고 요청함->운영체제가 run불러줌

        // Runnable 인터페이스를 상속 받아서 쓰레드를 만드는 방법
        Runnable runTask = new InterThread(); // 실제 작업 내용을 가지고 있지만 실제 쓰레드는 아님
        Thread runTh1 = new Thread(runTask);
        Thread runTh2 = new Thread(runTask);
        runTh1.start();
        runTh2.start();

        // 익명 객체로 쓰레드를 만드는 방법(class 없음)
        Runnable task2 = new Runnable() { // 객체 생성이 안되서 구현부가 생김
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("상속 받은 쓰레드 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합" + sum);
            }
        };
        Thread anonyTh1 = new Thread(task2);
        anonyTh1.start();
    }
        // 람다식으로 구현하기
        Runnable task = () -> {
            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("상속 받은 쓰레드 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합" + sum);
        };
    }

// 상속 받아서 쓰레드를 만드는 방법(좋은 방법은 아님)
class CustomThread extends Thread {
    @Override
    public void run() { // run
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속 받은 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합" + sum);
    }
}
// 상속 받은 것으로 Runnable interThread를 받아야 함
class InterThread implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합" + sum);
    }
}
