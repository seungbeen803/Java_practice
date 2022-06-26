class  GrandFather {
    public String name;
    public GrandFather(String name) {
        this.name = name;
        System.out.println("GrandFather 생성자");
    }
}

public class MyClass extends GrandFather {
    public MyClass(String str) {
        super(str); // super(str)에 의해 GrandFather(String name){} 클래스를 호출하여 처리함
        System.out.println("MyClass 생성자");
    }

    public static void main(String[] args) {
        MyClass s = new MyClass("홍길동");
    }

}
