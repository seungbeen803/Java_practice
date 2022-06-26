public class SubstringExam {
    public static void main(String[] args) {
        String strData1 = "I Love You";
        String strDate3;
        strDate3 = strData1.substring(7);
        System.out.println("strDate3.substring(7) -> " + strDate3);
        strDate3 = strData1.substring(2, 5);
        System.out.println("strDate3.substring(2, 5) -> " + strDate3);
    }
}
