class Ship {
    public String Name() {
        return "배 이름";
    }
}

class MyShip extends Ship{
    public String Name() {
        return "해적선";
    }
}

class YourShip extends Ship{
    public String Name() {
        return "타이타닉 호";
    }
}

class ShipName {
    public static void search(Ship s) {
        if(s instanceof MyShip) {
            MyShip b = new MyShip(); // ㄱ
            System.out.println("MyShip 이름 : " + b.Name());
        } else if(s instanceof YourShip){
            YourShip b = new YourShip(); // ㄴ
            System.out.println("YourShip 이름 : " + b.Name());
        }
    }
}

public class ShipMainExam {
    public static void main(String[] args) {
        // 업 캐스팅
        Ship myship = new MyShip();
        Ship yourship = new YourShip();

        ShipName.search(myship); // ㄷ
        ShipName.search(yourship); // ㄹ
    }
}

//설명
//ㄷ과 ㄹ에서 search() 메서드를 호출하면서 Ship s = new MyShip();, Ship s = new YourShip(); 형태로 업 캐스팅되었고
//ㄱ와 ㄴ 에 의해 객체 변수 b는 다운 캐스팅되었기 때문에 MyShip 클래스와 YourShip 클래스의 Name() 메서드를 실행시켜 실행 결과와 같이 출력된다.