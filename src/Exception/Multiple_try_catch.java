package Exception;

public class Multiple_try_catch {
    public static void main(String[] args) {
        String[] irum = new String[3];
        try{
            irum[3] = "홍길동";
            for (int i = 0; i <= irum.length; i++) {
                System.out.println(irum[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("배열 예외 발생");
        }catch(Exception e) {
            System.out.println("예외 발생");
        }
    }
}
