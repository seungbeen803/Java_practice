public class ValueofExam1 {
    public static void main(String[] args) {
        String stri = "123456";
        String strd = "123.56";

        System.out.println(Integer.valueOf(stri)); // 123456
        System.out.println(Double.valueOf(strd)); // 123.56
        System.out.println(Integer.valueOf(stri) + Double.valueOf(strd)); // 123579.56
    }
}
