package Thread;
// Thread 클래스 생성
// Thread 클래스 상속
class DerivedThread extends Thread {
    // 스레드 기능 구현 : run() 구현
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class Thread2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 스레드 객체 생성 : new 연산자
        DerivedThread d1 = new DerivedThread();
        DerivedThread d2 = new DerivedThread();
        // 스레드 실행 : start() 메서드 호출
        d1.start();
        d2.start();
        System.out.println("프로그램 종료");
    }
}
// d1과 d2가 번갈아가며 작업을 한다
// 사람이 느끼기엔 동시에 작업하는 것처럼 느껴짐(굉장히 빠른 속도로 진행되기 때문이다)