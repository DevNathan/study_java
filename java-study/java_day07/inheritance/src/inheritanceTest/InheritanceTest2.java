package inheritanceTest;

class Human {
    String name;
    
    public Human() {
        ;
    }
    
    public Human(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println("�Ա�");
    }
    
    void sleep() {
        System.out.println("���ڱ�");
    }
    
    void walk() {
        System.out.println("�� �߷� �ȱ�");
    }
}

class Monkey extends Human {
    @Override
    void walk() {
        super.walk();
        System.out.println("�� �߷� �ȱ�");
    }
}

public class InheritanceTest2 {
    public static void main(String[] args) {
        Monkey kingkong = new Monkey();
        
        kingkong.walk();
    }
}
