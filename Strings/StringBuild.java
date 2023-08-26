/*
String Builder Class:
This class helps make the string mutable. It is similar to the string buffer class but it is not thread safe.
Constructors:

1. StringBuilder() -> creates an empty string builder with the initial capacity of 16.
2. StringBuilder(String str) -> creates a string builder with the specified string.
3. StringBuilder(int capacity) -> creates an empty string builder with the specified capacity as length.

Methods:

1. append(String str) -> appends the string to the string builder.
2. insert(int offset, String str) -> inserts the string into the string builder at the specified offset.
3. replace(int startIndex, int endIndex, String str) -> replaces the string from the specified startIndex to endIndex with the specified string.
4. delete(int startIndex, int endIndex) -> deletes the string from the specified startIndex to endIndex.
5. reverse() -> reverses the string.
6. capacity() -> returns the current capacity of the string builder.
7. ensureCapacity(int minimumCapacity) -> increases the capacity of the string builder to the specified minimumCapacity.
8. charAt(int index) -> returns the character at the specified index.
9. indexOf(String str) -> returns the index of the specified string.
10. lastIndexOf(String str) -> returns the last index of the specified string.
11. substring(int startIndex) -> returns the substring from the specified startIndex.
12. substring(int startIndex, int endIndex) -> returns the substring from the specified startIndex to endIndex.

*/

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sujal Nayak (The Real Hero)");
        System.out.println(sb);

        //append method
        // sb.append("'This is appended Text'");
        // System.out.println(sb);

        //insert method
        // sb.insert(5, "`This is inserted text `");
        // System.out.println(sb);

        //charAt method
        // System.out.println(sb.charAt(17));

        //replace method
        // sb.replace(17, 21, "Pseudo");
        // System.out.println(sb);

        //delete method
        // sb.delete(17, 22);
        // System.out.println(sb);

        //reverse method
        // sb.reverse();
        // System.out.println(sb);

        //capacity method
        // System.out.println(sb.capacity());  //formula: (oldcapacity*2)+2
        // System.out.println(sb.indexOf("Hero"));
        // sb.replace(sb.indexOf("Hero"), sb.indexOf("o")+1, "Garba Lover");
        // System.out.println(sb);

        //ensureCapacity method
        // System.out.println("Capacity of string before ensureCapacity: " + sb.capacity());
        // sb.ensureCapacity(100);
        // System.out.println("Capacity of string after ensureCapacity: " + sb.capacity());

        //substring method
        // System.out.println(sb.substring(6));
        // System.out.println(sb.substring(6, 11));
    }
}