public class parseDataExam {
    public static void main(String[] args) {
        String a = "10", b = "20";
        int sum = 0;
        float average = 0;
        System.out.println("input data : " + a + " " + b); // input data : 10 20

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        sum = c + d;
        average = sum/2;
        System.out.println(a + " + " + b + " = " + sum); // 10 + 20 = 30
        System.out.println("평균 = " + average); // 평균 = 15.0
    }
}
