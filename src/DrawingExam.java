class Shape {
    public void draw() {
        System.out.println("도형 그리기");
    }
}

class Circle extends Shape {
    // private은 클래스 내의 멤버들에게만 접근 허용
    private String type = "원";
    
    public void draw() {
        System.out.println(type + " 그리기");
    }
    
    public void painting() {
        System.out.println("색 칠하기");
    }
}

public class DrawingExam {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.painting();
    }
}

//설명
//c는 Circle형 객체 변수이므로 Circle 클래스의 draw() 메서드와 painting() 메서드에 접근한다.