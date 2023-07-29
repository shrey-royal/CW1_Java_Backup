// Purpose: To show the use of Instance Initialization Block in Java.

class IIB_Demo {
    int a;  // Instance variable
    static int b;   // Static variable
    // Instance Initialization Block
    {
        a = 10;
        System.out.println("Instance Initialization Block");
    }

    // Static Initialization Block
    static {
        b = 20;
        System.out.println("Static Initialization Block");
    }

    // Constructor
    IIB_Demo() {
        System.out.println("Constructor");
    }
}

public class IIB {
    public static void main(String[] args) {
        IIB_Demo obj;   // Object
        obj = new IIB_Demo();   //Instance  (Memory got alloted)

        System.out.println("Value of a: " + obj.a);
        System.out.println("Value of b: " + IIB_Demo.b);
    }
}

/*
Instance Initialization Block
    - It is used to initialize the instance data member.
    - It runs each time when object of the class is created.
    - The initialization of the instance variable can be directly but there can be performed extra operations while initializing the instance variable in the instance initializer block.

How instace initialization block is different to constructor.

> The instance initializer block is created when instance of the class is created.
> The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
> The instance initializer block comes in the order in which they appear.

*/