package Thread;

// Thread 클래스 상속
class DerivedThread extends Thread {
    // 스레드 기능 구현 : run() 구현
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}

// 1. 스레드를 생성할 때
// 객체를 생성한 개수만큼 즉, 하나의 스레드 클래스를 가짐(여러 개의 스레드를 실행할 수 있다 -> 다형성)
// 2. 스레드의 개수는 main까지 포함!
// 3. 스레드를 시작할 때는 각가의 스레드를 따로따로 실행해야한다!!

// 총 스레드는 3개 main도 스레드임
// 스레드 main, d1, d2
public class Thread2Exam {
    public static void main(String[] args) { // main도 스레드이다
        System.out.println("프로그램 시작");
        // 스레드 객체 생성 -> new 연산자
        DerivedThread d1 = new DerivedThread();
        DerivedThread d2 = new DerivedThread();
        // start() 메서드 호출
        d1.start();
        d2.start();
        System.out.println("프로그램 종료");
    }
}
// d1과 d2가 번갈아가며 작업을 한다
// 사람이 느끼기엔 동시에 작업하는 것처럼 느껴짐(굉장히 빠른 속도로 진행되기 때문이다)
