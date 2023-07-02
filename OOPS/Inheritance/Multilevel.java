class Parent {
    void method1() {
        System.out.println("Parent's method1()");
    }
}

class Child extends Parent {
    void method2() {
        System.out.println("Child's method2()");
    }
}

class GrandChild extends Child {
    void method3() {
        System.out.println("GrandChild's method3()");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.method1();
        gc.method2();
        gc.method3();
    }
}
