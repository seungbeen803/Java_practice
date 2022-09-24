package Exception;

// NullPointerException 클래스
public class NullPointExam {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("문자열 : " + str.length());
        }catch (NullPointerException npe) {
            // getMessage() : 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있음
            // 해당 객체에 포함된 에러 메세지를 얻는 경우
            System.out.println("npe.getMessage() : " + npe.getMessage());
            // toString() : 문자열 형태로 에러 메세지를 출력하는 경우
            System.out.println("npe.toString() : " + npe.toString());
            // printStackTrace() : 예외 발생 당시의 호출 스택에 있었던 메서드의 정보와 예외 메세지 화면
            // 예외가 발생하기까지의 메서드 호출 순서 화면을 출력하는 역할
            // print가 붙어있어 print문과 같이 작성하지 않아도 됨
            npe.printStackTrace();
        }finally {
            System.out.println("무조건 실행");
        }
    }
}
