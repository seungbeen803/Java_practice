package Exception;

// ArrayIndexOutOfBoundsException 클래스
public class ArrayExam {
    public static void main(String[] args) {
        try {
            int data[] = new int[]{10, 20, 30, 40, 50};
            // for (int i = 0; i < data.length ; i++)로 고쳐 작성한다면 에러 없이 정상 작동한다.
            for (int i = 0; i <= data.length ; i++) {
                System.out.println("data[" + i + "] = " + data[i]);
            }
        }catch (ArrayIndexOutOfBoundsException aie) {
            // getMessage() : 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있음
            // 해당 객체에 포함된 에러 메세지를 얻는 경우
            System.out.println("aie.getMessage() : " + aie.getMessage());
            // toString() : 문자열 형태로 에러 메세지를 출력하는 경우
            System.out.println("aie.toString() : " + aie.toString());
            // printStackTrace() : 예외 발생 당시의 호출 스택에 있었던 메서드의 정보와 예외 메세지 화면
            // 예외가 발생하기까지의 메서드 호출 순서 화면을 출력하는 역할
            // print가 붙어있어 print문과 같이 작성하지 않아도 됨
            aie.printStackTrace();
        }finally {
            System.out.println("이곳은 반드시 거친다.");
        }
    }
}
