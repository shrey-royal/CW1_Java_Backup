public class StrinGBuffer {
    public static void main(String[] args) {
        /*
        StringBuffer sb = new StringBuffer("Random String in StringBuffer Class");   //capacity 16
        System.out.println("Length: " + sb.length());
        
        //append
        sb.append(" Appended String");  //16
        System.out.println(sb);
        System.out.println("Length: " + sb.length());

        //insert
        sb.insert(0, "Inserted String ");   //16
        System.out.println(sb);
        System.out.println("Length: " + sb.length());

        //replace
        sb.replace(1, 4, "n");
        System.out.println(sb);
        System.out.println("Length: " + sb.length());

        //delete
        sb.delete(1, 2);
        System.out.println(sb);

        //reverse
        sb.reverse();   //reverses the string
        System.out.println(sb);

        //capacity -> (oldcapacity*2)+2
        System.out.println("capacity: " + sb.capacity());
        */

        // StringBuffer sb1 = new StringBuffer();  //16
        // System.out.println("capacity: " + sb1.capacity());
        // sb1.append("Hello");    //5
        // System.out.println("capacity: " + sb1.capacity());
        // sb1.append("cw1 batch is learning java from home");
        // System.out.println("cw1 batch is learning java from home".length());
        // System.out.println("capacity: " + sb1.capacity());

        //ensurecapacity
        // sb1.ensureCapacity(10); //no change
        // System.out.println("capacity: " + sb1.capacity());
        // sb1.ensureCapacity(50); //now (41*2)+2
        // System.out.println("capacity: " + sb1.capacity());
    }
}
/*
StringBuffer is just like String, but can be modified and it is thread-safe.

Thread safe means multiple threads can't access it simultaneously.


constructors: 

1. StringBuffer() : creates an empty string buffer with the initial capacity of 16.
2. StringBuffer(int capacity) : creates an empty string buffer with the specified capacity as length.
3. StringBuffer(String str) : creates a string buffer with the specified string.

Formula to calculate capacity: capacity = (oldcapacity*2)+2

suppose default capacity is 16, and now i'm adding a string of length 10, 
then the capacity will be (16*2)+2 = 34

*/