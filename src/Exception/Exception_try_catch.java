package Exception;

public class Exception_try_catch {
    public static void main(String[] args) {
        String[] irum = new String[3];
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(irum[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("예외 발생");
            }
    }
}
