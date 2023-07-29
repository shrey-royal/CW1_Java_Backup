class Vedant {
    //constructor overriding
    Vedant() {
        System.out.println("Vedant is Taking Photos in const");
    }

    public void iPhone() {
        System.out.println("Vedant is Taking Photos");
    }
}

class Sujal extends Vedant {
    //constructor overriding
    Sujal() {
        super();    //calling parent class constructor
        System.out.println("Sujal will Send Photos in doc format to Vedant");
    }

    public void iPhone() {
        System.out.println("Vedant will Send Photos in doc format to Sujal");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Vedant v = new Vedant();
        v.iPhone(); // Taking Photos
        Sujal s = new Sujal();
        s.iPhone(); // Sending Photos in doc format
    }
}