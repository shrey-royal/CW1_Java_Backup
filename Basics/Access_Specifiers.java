import java.util.Scanner;   //package 

class Dummy { // final class cannot be inherited
    Scanner sc = new Scanner(System.in);

    public String chocolate = "Dairy Milk";
    public String name = "Sujal";

    public void print() {
        System.out.println("Chocolate: " + chocolate);
        System.out.println("Hello World");
    }
}

//private class Dummy2 {} // Error -> private class cannot be created


public final class Access_Specifiers {
    public static void main(String[] args) {
        // Access Specifiers
        // public -> accessible everywhere
        // private -> accessible only in the class
        // protected -> accessible in the package and in the sub-classes
        // default -> accessible only in the package
        
        Dummy d = new Dummy();
        System.out.println(d.name);
        d.name = "Sujal Nayak";
        System.out.println(d.name);
        d.print();
        // System.out.println(d.chocolate); // Error
    }
}

/*
 * Example of public access specifier
 * 
 * public class Access_Specifiers { public static void main(String[] args) {
 * System.out.println("Hello World"); } }
 * 
 * 
 * Example of private access specifier
 * 
 * public class Access_Specifiers { private static void main(String[] args) {
 * System.out.println("Hello World"); } }
 * 
 * 
 * Q. Final class members can be changed or not?
 * A. No, final class members cannot be changed. 
 */