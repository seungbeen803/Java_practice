class Car1 {
    String carname;
    String color;
    int velocity;
    
    void speedUp() {
        velocity += 5;
        System.out.println("속도 " + velocity + " 증가");
    }
    
    void speedDown() {
        velocity -= 5;
        System.out.println("속도 " + velocity + " 감소");
    }
}

class Truck1 extends Car1 {
    int ton = 5;

    void speedUp() {
        velocity += 10;
        System.out.println("속도 " + velocity + " 증가" );
    }
}
public class MainTruckExam {
    public static void main(String[] args) {
        Truck1 mytruck = new Truck1();
        mytruck.speedUp(); // Truck1 클래스의 메서드에서 실행
        mytruck.speedDown(); // Car 클래스의 메서드에서 실행
    }
}

// 설명
// mytruck.SpeedUp() 명령은 Truck1 클래스의 speedUp() 메서드를 수행하고, mytruck.speedDown() 명령은 상위 클래스인
// Car 클래스의 speedDown() 메서드를 수행한다.