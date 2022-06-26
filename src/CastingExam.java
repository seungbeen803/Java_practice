class Car2 {
    String name = "차";

    String print() {
        return "[나는 " + name + "이다]";
    }
}

class Bus extends Car2 {
    String name = "버스";

    String print() {
        return "[차의 종류는 " + name + "이다.]";
    }
}

class Truck2 extends Car2 {
    String name = "트럭";

    String print() {
        return "[차의 종류는 " + name + "이다.]";
    }
}

public class CastingExam {
    public static void main(String[] args) {
        Car2 mycar, yourcar;
        Bus mybus, yourbus;
        Truck2 mytruck, yourtruck;
        mycar = new Car2();
        mybus = new Bus();
        mytruck = new Truck2();

        System.out.println("[" + mycar.print() + "]");
        System.out.println("[" + mybus.print() + "]");
        System.out.println("[" + mytruck.print() + "]");
        // 업 캐스팅 -> 상위 클래스 객체 = 하위 클래스 객체
        yourcar = mybus; // 업 캐스팅 1
        // 다운 캐스팅 -> 하위 클래스 객체 = (클래스이름)상위 클래스 객체
        yourbus = (Bus)yourcar; // 다운 캐스팅 2
        System.out.println("[" + yourbus.print() + "]");
        yourcar = mytruck; // 업 캐스팅 1
        yourtruck = (Truck2) yourcar; // 다운 캐스팅 2
        System.out.println("[" + yourtruck.print() + "]");
    }
}

//설명
//1의 yourcar는 mybus와 mytruck을 업 캐스팅한 것이고, 2의 yourbus와 yourtruck은 다시 yourcar를 다운 캐스팅한 것이다.