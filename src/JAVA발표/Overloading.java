package JAVA발표;

class Add {
    // plus() 메서드 생성
    // 매개 변수가 각각 int, double 타입으로 선언된 plus() 메서드 생성
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double plus(double x, double y) {
        double result = x + y;
        return result;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Add sum = new Add();
        // 오버로딩된 메서드를 호출할 경우 JVM은 매개값의 타입을 보고 메서드를 선택합니다.
        System.out.println(sum.plus(10, 20)); // int 타입의 plus() 메서드 실행
    }
}

