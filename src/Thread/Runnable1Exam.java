package Thread;
// Runnable 인터페이스를 구현하는 방법
// 작성 순서
// 1) 스레드 클래스 생성
// Runnable 인터페이스 구현
class RTop implements Runnable {
    // 스레드 기능 구현 : run() 구현
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}
public class Runnable1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 스레드 객체 생성 : new 연산자
        RTop rt = new RTop(); // 스레드 클래스 아님
        Thread thd = new Thread(rt); // 스레드 클래스가 아닌 것을 스레드 클래스로 만들어주는 작업
        // 스레드 실행 : start() 메서드 호출
        thd.start();
        System.out.println("프로그램 종료");
    }
}
