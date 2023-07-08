public class Hash {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = new String("Hello World");

        System.out.println(str == str2);

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));

        //identityHashCode() is used to get the hashcode of an object
        //even if it is overridden
    }
}
