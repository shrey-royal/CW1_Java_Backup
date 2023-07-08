// > Animal (Dog, Cat, Lion, Tiger) -> Behaviour (Bark, Meow, Roar)

class Animal {
    public void bark() {
        System.out.println("Animal is barking");
    }

    public void meow() {
        System.out.println("Animal is meowing");
    }

    public void roar() {
        System.out.println("Animal is roaring");
    }
}


public class Task1 {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.bark();

        Animal cat = new Animal();
        cat.meow();

        Animal lion = new Animal();
        lion.roar();

        Animal tiger = new Animal();
        tiger.roar();

    }
}
