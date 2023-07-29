class Parent {
    int a = 10;
    Parent() {
        System.out.println("Parent Constructor");
    }
    void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {
    int a = 20;
    Child() {
        System.out.println("Child Constructor" + super.a);
    }
    void display() {
        // System.out.println("Child Display");
        super.display();
    }
    void print() {
        // System.out.println("Child Print");
        System.out.println(super.a);
    }
}

public class super_KW {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.a);    // 20
        c.display();    // Child Display
        c.print();    // Child Print
        System.out.println("Super Keyword");
        System.out.println(c.a);    // 20
        c.display();    // Child Display
        c.print();  // Child Print
    }
}