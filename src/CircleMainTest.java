class CircleArea_Exam {
    double area(int r) { // 원의 면적 구하기
        return 3.14 * r * r;
    }
    
    protected double round(int r) { // 원의 둘레 구하기
        return 3.14 * 2 * r;
    }
}

public class CircleMainTest extends CircleArea_Exam {
    public static void main(String[] args) {
        CircleArea_Exam cp = new CircleArea_Exam();
        System.out.println("원의 면적은 " + cp.area(10));
        System.out.println("원의 둘레는 " + cp.round(10));
    }
}
