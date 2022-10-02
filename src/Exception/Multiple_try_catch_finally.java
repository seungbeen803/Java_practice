package Exception;

public class Multiple_try_catch_finally {
    public static void main(String[] args) {
        try{
            String[] irum = new String[3];
            irum[3] = "최승빈";
            for (int i = 0; i <= irum.length; i++) {
                System.out.println(irum[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("배열 예외 발생");
        }catch(Exception e) {
            System.out.println("예외 발생");
        }finally {
            System.out.println("무조건 실행합니다...");
        }
    }
}
