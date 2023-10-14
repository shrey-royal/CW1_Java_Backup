import java.util.Random;
import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> v = new Vector<>();

        // System.out.println(v.capacity());
        for (int i = 0; i < 20; i++) {
            v.add(rand.nextInt(10));
        }

        // System.out.println(v);
        // System.out.println(v.size());

        // v.remove(3);
        // System.out.println(v);
        // System.out.println(v.size());

        // v.removeIf(n -> (n >= 5));
        // System.out.println(v + "\n" + v.size());

        // Vector<Integer> v1 = new Vector<>();
        // for (int i = 0; i < 10; i++) {
        //     v1.add(rand.nextInt(5));
        // }
        // System.out.println(v1);

        // v.removeAll(v1);
        // System.out.println(v + "\n" + v.size());

        String s = new String();
        s = v.toString();

        System.out.println(s);
    }
}


/*
Vector: Vector is a growable array of objects. Like an array, it contains components that can be accessed using an integer index. However, the size of a Vector can grow or shrink as needed to accommodate adding and removing items after the Vector has been created.

Methods:
1. addElement(Object o): Adds the specified component to the end of this vector, increasing its size by one.
2. capacity(): Returns the current capacity of this vector.
3. clone(): Returns a clone of this vector.
4. contains(Object elem): Returns true if this vector contains the specified element.
5. elementAt(int index): Returns the component at the specified index.
6. firstElement(): Returns the first component (the item at index 0) of this vector.
7. isEmpty(): Tests if this vector has no components.
8. lastElement(): Returns the last component of the vector.
9. removeElement(Object obj): Removes the first occurrence of the specified element in this vector.
10. removeAllElements(): Removes all components from this vector and sets its size to zero.
11. removeElementAt(int index): Deletes the component at the specified index.
12. setElementAt(Object obj, int index): Sets the component at the specified index of this vector to be the specified object.
13. size(): Returns the number of components in this vector.
14. toString(): Returns a string representation of this vector, containing the String representation of each element.
15. trimToSize(): Trims the capacity of this vector to be the vector's current size.



*/