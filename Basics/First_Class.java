class Parent_Class {
    protected int parent_var = 10;

    public Parent_Class() {
        System.out.println("Parent Class Constructor");
        System.out.println("Parent Variable: " + parent_var);
    }
}

class Child_Class extends Parent_Class {
    public Child_Class() {
        parent_var = 20; // parent_var is inherited from parent class
        System.out.println("Child Class Constructor");
        System.out.println("Parent Variable: " + parent_var);
    }
}

class Dummy_Class extends Child_Class {
    public Dummy_Class() {
        parent_var = 30; // parent_var is inherited from parent class
        System.out.println("Dummy Class Constructor");
        System.out.println("Parent Variable: " + parent_var);
    }
}

class Single_Inheritance {
    public static void main(String[] args) {
        // Child_Class obj = new Child_Class();
        Dummy_Class obj = new Dummy_Class();
    }
}

/*
 * OOPS - Object Oriented Programming System
 * 1. Inheritance -> code reusability, parent-child relationship
 * * 1.1 Single Inheritance -> one parent and one child
 * * 1.2 Multilevel Inheritance -> one parent and one child, but child can be parent for another child
 * * 1.3 Hierarchical Inheritance -> one parent and multiple children
 * * 1.4 Multiple Inheritance (not supported in java using classes, but supported using interfaces)
 * * 1.5 Hybrid Inheritance (not supported in java using classes, but supported using interfaces)
 * 
 * 
 * 2. Polymorphism -> one thing can be represented in multiple forms
 * 3. Abstraction -> hiding the implementation details
 * 4. Encapsulation -> binding the data with the methods
 */


/*
 * Control Statements
 * OOPS
 * String
 * Exception Handling
 * Collections
 * Multithreading
 * File Handling
 * JDBC - Java to DataBase Connection (statements, prepared statements, batch processing)
 */
