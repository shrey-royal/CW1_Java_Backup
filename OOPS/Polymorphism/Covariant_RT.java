class Animal {
    public Animal getAnimal() {
        return this;
    }//returning Animal class instance

    Animal a() {
        System.out.println("Animal");
        return null;
    }
}

class Dog extends Animal {
    //You cannot override getAnimal() method to return Dog
    public Dog getAnimal() {
        return this;
    }//returning Dog class instance

    Dog a() {   // we can't override method with different return type
        System.out.println("Dog");
        return null;
    }
}

public class Covariant_RT {
    public static void main(String[] args) {
        new Animal().getAnimal().a();
        new Dog().getAnimal().a();
    }
}

// Covariant return type

/*
Co-variant return type is concept of java 5.0 version. It is applicable only for non-primitive return type.

If a method is trying to override its parent method by changing return type of parent method, then it is known as co-variant return type.

class A {
    A get() {
        return this;
    }
}

class B1 extends A {
    B1 get() {
        return this;
    }
}

non-primitive datatypes:
1. Object
2. String
3. Array
4. Class
5. Interface
6. Enum

*/