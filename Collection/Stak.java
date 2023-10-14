import java.util.Random;
import java.util.Stack;

public class Stak {
    public static void main(String[] args) {
        Random rand = new Random();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 10; i++) {
            s.push(rand.nextInt(10));
        }
        System.out.println(s);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.push(10));
        // System.out.println(s.search(7));
        System.out.println(s.size());
        System.out.println(s);
    }
}

/*
Stack is a subclass of Vector that implements a standard last-in, first-out stack.

Methods:
1. empty(): Tests if this stack is empty.
2. peek(): Looks at the object at the top of this stack without removing it from the stack.
3. pop(): Removes the object at the top of this stack and returns that object as the value of this function.
4. push(Object item): Pushes an item onto the top of this stack.
5. search(Object o): Returns the 1-based position where an object is on this stack.


*/