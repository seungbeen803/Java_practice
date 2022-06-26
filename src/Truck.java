class Car {
    Car() {// default 생성자 추가
        System.out.println("차 이름이 있는 생성자");
    }
}

public class Truck extends Car {
    Truck() {
        System.out.println("Truck 생성자");
    }
    public static void main(String[] args) {
     Truck mytruck = new Truck();
    }
}
