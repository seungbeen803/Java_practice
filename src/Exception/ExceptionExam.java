package Exception;

// Exception 클래스
// 모든 예외 처리 클래스의 상위 클래스이다.
// 모든 에러를 처리(모든 에러에 대응)
// 단점 : 어떤 에러가 발생했는지 알 수 없다.
public class ExceptionExam {
    public static void main(String[] args) {
        try {
            int data[] = new int[]{10, 20, 30, 40, 50};
            for (int i = 0; i <= data.length ; i++) {
                System.out.println("data[" + i + "] = " + data[i]);
            }
        }catch (NullPointerException ne) {
            System.out.println("ne.toString() : " + ne.toString());
        }catch (Exception e) {
            System.out.println("위 경우 이외의 에러 처리");
        }
    }
}
