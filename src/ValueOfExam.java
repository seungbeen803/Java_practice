public class ValueOfExam {
    public static void main(String[] args) {
        char ch = 'A';
        String strDate1 = "A";
        String strDate2;
        strDate2 = strDate1.valueOf(ch);
        if(strDate1.equals(strDate2)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }
}
