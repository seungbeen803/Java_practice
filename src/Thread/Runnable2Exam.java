package Thread;
// 스레드 클래스 생성
// Runnable 인터페이스 구현
class RTop2 implements Runnable {
    // 스레드 기능 구현 : run() 구현
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class Runnable2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 1. Runnable을 구현하는 객체 만들기
        RTop2 rt = new RTop2();
        // 2. Runnable을 장착한 후 진짜 스레드 만들기
        Thread thd1 = new Thread(rt);
        Thread thd2 = new Thread(rt);
        // 3. 스레드 동작시키기 : start() 메서드 호출
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}

