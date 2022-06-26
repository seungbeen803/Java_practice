class Greeting {
    public String name = "홍길동";
    public void sayHello() {
        System.out.println("씨 안녕하세요");
    }
}

public class EngHello extends Greeting {
    public String name ="Mr.Hong";
    public void sayHello() {
        System.out.println(name + " Nice to meet you");
    }

    public void test() {
        System.out.print(super.name); // super.상위 클래스의 멤버 변수
        super.sayHello(); // super.상위 클래스의 메서드 이름 ()
    }

    public static void main(String[] args) {
        EngHello eng = new EngHello();
        eng.sayHello();
        eng.test();
    }
}
