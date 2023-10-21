import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class HasSet {
    public static void main(String[] args) {
        // HashSet<String> lhs = new HashSet<String>();

        // lhs.add("Toy Car");
        // lhs.add("Toy Train");
        // lhs.add("Toy Plane");
        // lhs.add("Toy Boat");
        // lhs.add("Toy Car");  // duplicate element gets ignored
        
        // System.out.println("HashSet: " + lhs);

        // System.out.println("Is HashSet empty? " + lhs.isEmpty());
        // System.out.println("Size of HashSet: " + lhs.size());

        // System.out.println("Does HashSet contains Toy Car? " + lhs.contains("Toy Car"));

        // lhs.remove("Toy Car");
        // System.out.println("After removing Toy Car, HashSet: " + lhs);

        // lhs.clear();
        // System.out.println("After clearing HashSet: " + lhs);


        // HashSet<String> hs1 = new HashSet<String>();
        // hs1 = (HashSet<String>)lhs.clone();
        
        // System.out.println("Clone of HashSet: " + hs1);

        // Spliterator<String> sitr = lhs.spliterator();
        // System.out.println("Content of HashSet: ");
        // // while(sitr.tryAdvance((n) -> System.out.println(n)));
        // sitr.forEachRemaining((n) -> System.out.println(n));

        // ---------------------------------------------------------------

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Toy Car");
        lhs.add("Toy Train");
        lhs.add("Toy Plane");
        lhs.add("Toy Boat");
        
        System.out.println("HashSet: " + lhs);

        // System.out.println("Is HashSet empty? " + lhs.isEmpty());
        // System.out.println("Size of HashSet: " + lhs.size());

        // System.out.println("Does HashSet contains Toy Car? " + lhs.contains("Toy Car"));

        // lhs.remove("Toy Car");
        // System.out.println("After removing Toy Car, HashSet: " + lhs);

        // lhs.clear();
        // System.out.println("After clearing HashSet: " + lhs);


        // LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
        // hs1 = (LinkedHashSet<String>)lhs.clone();
        
        // System.out.println("Clone of HashSet: " + hs1);

        // Spliterator<String> sitr = lhs.spliterator();
        // System.out.println("Content of HashSet: ");
        // // while(sitr.tryAdvance((n) -> System.out.println(n)));
        // sitr.forEachRemaining((n) -> System.out.println(n));
        
    }
}

/*
1. add() - add element to the HashSet
2. clear() - remove all elements from the HashSet
3. clone() - return a shallow copy of the HashSet
4. contains() - return true if the HashSet contains the specified element
5. isEmpty() - return true if the HashSet is empty
6. remove() - remove the specified element from the HashSet
7. size() - return the number of elements in the HashSet
8. spliterator() - return a Spliterator over the elements in the HashSet

*/