public class IntegerEqualExam {
    public static void main(String[] args) {
        Integer in1 = new Integer(100);
        Integer in2 = new Integer(100);
        Integer in3 = new Integer(200);

        System.out.println("in1.equals(in2) = " + in1.equals(in2)); // in1.equals(in2) = true
        System.out.println("in1.equals(in3) = " + in1.equals(in3)); // in1.equals(in3) = false
    }
}
