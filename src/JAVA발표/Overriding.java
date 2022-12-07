package JAVA발표;

class Point { // Point 클래스
    int x;
    int y;

    String getLocation() {
        return "x: " + x + "," + "y: " + y;
    }
}

class Point3D extends Point { // Point3D 클래스가 Point 클래스를 상속 받음
    int z;

    // 부모의 getLocation()을 오버라이딩
    // 오버라이딩 : 메서드의 동작만을 재정의하는 것
    // 오버라이딩의 조건
    // 1. 메서드의 선언부는 기존 메서드와 완전히 같아야함
    // 2. 부모 클래스의 메서드보다 접근 제어자를 더 좁은 범위로 변경할 수 없음
    String getLocation() {
        // z 추가
        return "x: " + x + ", " + "y: " + y + ", " + "z: " + z;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}
