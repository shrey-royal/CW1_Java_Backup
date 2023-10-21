import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Priorityq {
    public static void main(String[] args) {
        // PriorityQueue<String> pq = new PriorityQueue<>();

        // pq.add("Red");
        // pq.add("Green");
        // pq.add("Orange");
        // pq.add("White");
        // pq.add("Black");
        // pq.add("Blue");

        // System.out.println(pq);

        // pq.remove("Black");
        // System.out.println(pq);

        // System.out.println(pq.peek());
        // System.out.println(pq.poll());
        // System.out.println(pq);

        // System.out.println(pq.size());
        // System.out.println(pq.isEmpty());
        // pq.clear();

        // System.out.println(pq);


        ArrayDeque<String> cars = new ArrayDeque<>();

        cars.add("Honda Civic Type R");
        cars.addFirst("Nissan GTR");
        cars.addFirst("Toyota Supra");
        cars.addLast("Mazda RX-7");
        cars.addLast("Mustang GT");

        System.out.println(cars);

        // cars.add("Toyota Supra MK4");
        // System.out.println(cars);

        // cars.removeFirst();
        // cars.removeLast();
        // System.out.println(cars);

        // System.out.println(cars.getFirst());
        // System.out.println(cars.getLast());


    }
}

/*
Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue
    3. peek() - return the element at the front of the Queue
    4. poll() - return the element at the front of the Queue and remove it
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue

Methods in Dequeue:
    1. addFirst() - add element to the front of the Dequeue
    2. addLast() - add element to the end of the Dequeue
    3. removeFirst() - remove element from the front of the Dequeue
    4. removeLast() - remove element from the end of the Dequeue
    5. getFirst() - return the element at the front of the Dequeue
    6. getLast() - return the element at the end of the Dequeue
    7. size() - return the number of elements in the Dequeue
    8. isEmpty() - return true if the Dequeue is empty
    9. clear() - remove all elements from the Dequeue


*/