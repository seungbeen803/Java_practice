package Exception;

public class Multiple_try_catch {
    public static void main(String[] args) {
        String[] irum = new String[3];
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(irum[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("배열 예외 발생");
        }catch(Exception e) {
            System.out.println("예외 발생");
        }
    }
}
