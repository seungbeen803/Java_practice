package Exception;
import java.io.*;

// IOException 클래스
public class Echo2Exam {
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            while (true) {
                int i = is.read();
                if(i == -1) break;
                System.out.print((char)i);
            }
        }catch (IOException e) {
            // getMessage() : 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있음
            // 해당 객체에 포함된 에러 메세지를 얻는 경우
            System.out.println("e.getMessage() : " + e.getMessage());
            // toString() : 문자열 형태로 에러 메세지를 출력하는 경우
            System.out.println("e.toString() : " + e.toString());
            // printStackTrace() : 예외 발생 당시의 호출 스택에 있었던 메서드의 정보와 에외 메세지 화면 출력
            // print가 붙어있어 print문과 같이 쓰지 않아도 된다
            // 예외가 발생하기까지의 메서드의 호출 순서 화면을 출력하는 역할
            e.printStackTrace();
        }
    }
}
