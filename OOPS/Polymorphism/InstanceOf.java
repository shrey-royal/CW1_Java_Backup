class Parent {
    public void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("Child");
    }
}

class InstanceOf {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();    // Parent class reference to Child class object (downcasting)
        System.out.println(p instanceof Parent);    // true
        System.out.println(c instanceof Child);   // true
        System.out.println(pc instanceof Parent);   // true
        System.out.println(pc instanceof Child);    // true
    }
}