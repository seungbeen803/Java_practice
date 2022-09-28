package Thread;

// Runnable 인터페이스 구현
class RTop3 implements Runnable {
    // 스레드 기능 구현 : run() 구현
    public void run() {
        for (int i = 0; i < 30; i++) {
            // Thread.currentThread() 현재 작동 중인 스레드 명시
            System.out.print((Thread.currentThread()).getName() + i + "\t");
        }
    }
}

public class Runnable3Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 1. Runnable을 구현하는 객체 생성
        RTop3 rt3 = new RTop3();
        // 2. Runnable을 장착한 후 진짜 스레드 만들기
        Thread thd1 = new Thread(rt3, "a");
        Thread thd2 = new Thread(rt3, "b");
        // 스레드 우선순위 리턴
        // 우선순위를 지정하지 않으면 main 스레드 우선순위인 5로 출력됨
        System.out.println(thd1.getPriority());
        System.out.println(thd2.getPriority());
        // 스레드 이름 변경
        thd1.setName("new_a");
        thd2.setName("new_b");
        // 스레드 이름 리턴
        System.out.println("스레드 thd1의 이름 : " + thd1.getName());
        System.out.println("스레드 thd2의 이름 : " + thd2.getName());
        // 스레드 우선순위 적용
        thd1.setPriority(9);
        thd2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thd1.getPriority());
        System.out.println(thd2.getPriority());
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}
