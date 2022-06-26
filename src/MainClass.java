class Student {
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;

    public Student(String name, String hakbun)  {
        this.name = name;
        this.hakbun = hakbun;
    }
    public void study() {
        System.out.println("공부를 하다.");
    }

    public void eat() {
        System.out.println("식사를 하다.");
    }

    public void test() {
        System.out.println("시험을 보다.");
    }

    public void extra_act() {
        System.out.println("동아리 활동하다.");
    }
}

class Leader extends Student {
   boolean leader;

    public Leader(String name, String hakbun, boolean leader) {
        super(name, hakbun);
        this.leader = leader;
    }

    public void isLeader() {
        if(leader == true) {
            System.out.println("학생회장입니다.");
        } else {
            System.out.println("학생회장이 아닙니다.");
        }
    }
    public void Hi() {
        System.out.println("인사를 하다.");
    }
}

public class MainClass {

    public static void main(String[] args) {
        Leader hong = new Leader("홍길동", "30130", true);
        hong.isLeader();
    }

}