class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Horse extends Animal {
    public void sound() {
        System.out.println("Neighbour is making a sound");
    }
}

public class Late_Binding {
    public static void main(String[] args) {
        // Animal obj = new Animal();  // Animal reference and object
        // obj.sound();

        Animal obj = new Horse();   // Animal reference but Horse object
        obj.sound();
    }
}

/*
Dynamic Binding or late binding is a concept where the compiler doesn’t decide the method to be called at compile-time.

It is decided at runtime. In this process, an overridden method is called through the reference variable of a superclass.

*/