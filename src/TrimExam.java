public class TrimExam {
    public static void main(String[] args) {
        String strDate1 = " I Love You ";
        String strDate2;
        strDate2 = strDate1.trim();
        System.out.println("strDate2.trim() -> " + strDate2);
        if (strDate1.equals(strDate2)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }
}
