package 쓰레드예제3번;
    // 쓰레드간의 협업 : wait(), notify(), notifyAll()
    // notify() : 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 변경
    // wait() : 자신을 일시 정지 상태로 만듦
public class ThMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); //객체 생성
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}

class WorkObject {// 같은 패키지는 허용되고, 다른 패키지에서는 허용안함

    // synchronized : 멀티쓰레드 환경에서 임계역에 접근을 방지 하는 역할(Lock / Unlock)
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦
        try {
            wait(); // A는 잠듦
        } catch (InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadA를 실행 대기 상태로 만듦
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }
}

class ThreadA extends Thread {
    final private WorkObject workObject; // null상태 객체가 없음

    public ThreadA(WorkObject workObject) { //객체를 만들어서 넣어줘야한다.(오버라이딩해서 만들어주기)
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}


class ThreadB extends Thread {
    final private WorkObject workObject; // null상태 객체가 없음, 바뀌면 안되서 final 붙여야함

    public ThreadB(WorkObject workObject) { //객체를 만들어서 넣어줘야한다.(오버라이딩해서 만들어주기)
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}
