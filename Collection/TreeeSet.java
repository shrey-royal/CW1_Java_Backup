import java.util.Iterator;
import java.util.TreeSet;

public class TreeeSet {
    public static void main(String[] args) {
        // TreeSet<String> ts = new TreeSet<String>();

        // ts.add("Rahul");
        // ts.add("Raj");
        // ts.add("Rohan");
        // ts.add("Sujal");
        // ts.add("Ajay");

        // TreeSet<Integer> ts = new TreeSet<Integer>();

        // ts.add(64);
        // ts.add(24);
        // ts.add(12);
        // ts.add(48);
        // ts.add(96);

        TreeSet<Character> ts = new TreeSet<>();

        ts.add('A');
        ts.add('B');
        ts.add('C');
        ts.add('D');
        ts.add('E');
        
        // System.out.println(ts);

        // Iterator<Integer> i = ts.descendingIterator();
        // while(i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // System.out.println("Lowest Value: " + ts.pollFirst());
        // System.out.println("Highest Value: " + ts.pollLast());

        System.out.println("Initial Set: " + ts);

        System.out.println("Head Set: " + ts.headSet('C', true));
        System.out.println("SubSet: " + ts.subSet('B', false, 'D', true));
        System.out.println("TailSet: " + ts.tailSet('C', false));
    }
}

/*
Methods of TreeSet:

1. boolean add(Object o): This method adds the specified element to this set if it is not already present.
2. boolean addAll(Collection c): This method adds all of the elements in the specified collection to this set.
3. void clear(): This method removes all of the elements from this set.
4. Object clone(): This method returns a shallow copy of this TreeSet instance.
5. boolean contains(Object o): This method returns true if this set contains the specified element.
6. boolean isEmpty(): This method returns true if this set contains no elements.
7. Iterator iterator(): This method returns an iterator over the elements in this set in ascending order.
8. boolean remove(Object o): This method removes the specified element from this set if it is present.
9. int size(): This method returns the number of elements in this set.
10. Object[] toArray(): This method returns an array containing all of the elements in this set.
11. Comparator comparator(): This method returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.
12. Object first(): This method returns the first (lowest) element currently in this set.
13. SortedSet headSet(Object toElement): This method returns a view of the portion of this set whose elements are strictly less than toElement.
14. Object last(): This method returns the last (highest) element currently in this set.
15. SortedSet subSet(Object fromElement, Object toElement): This method returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
16. SortedSet tailSet(Object fromElement): This method returns a view of the portion of this set whose elements are greater than or equal to fromElement.


*/