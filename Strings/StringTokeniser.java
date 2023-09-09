import java.util.StringTokenizer;

public class StringTokeniser {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello, I am learning Java", " ");

        // while(st.hasMoreTokens()) {
        //     System.out.println(st.nextToken());  //returns string
        // }

        // System.out.println("Number of tokens: " + st.countTokens());

        // System.out.println("Next token is: " + st.nextToken(","));


        while(st.hasMoreElements()) {
            System.out.println(st.nextElement());   //returns object
        }
    }
}
