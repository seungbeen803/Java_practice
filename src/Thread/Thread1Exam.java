package Thread;

// Thread 클래스를 상속하는 방법
// 스레드 클래스 생성
// Thread 클래스 상속
class Top extends Thread {
    // 스레드 기능 구현 : run() 구현
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class Thread1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 스레드 객체 생성 -> new 연산자
        Top d = new Top();
        // star() 메서드 호출
        d.start();
        System.out.println("프로그램 종료");
    }
}
