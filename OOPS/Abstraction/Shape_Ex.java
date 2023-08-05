abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("Displaying Shape");
    }
}

/*
 * WE can have abstract class without any abstract method...
 */

class Circle extends Shape {    // Concrete class
    void draw() {
        System.out.println("Drawing Circle");
    }

    void display() {
        System.out.println("Displaying Circle");
    }
}

class Rectangle extends Shape { // Concrete class
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    void display() {
        System.out.println("Displaying Rectangle");
    }
}

public class Shape_Ex {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.display();
        s = new Rectangle();
        s.draw();
        s.display();

        s = new Shape() {
            void draw() {
                System.out.println("Drawing Triangle");
            }
        };

        s.draw();
        s.display();

        Shape s1 = new Shape() {
            void draw() {
                System.out.println("Drawing Sujal");
            }
        };

        s1.draw();
    }
}
