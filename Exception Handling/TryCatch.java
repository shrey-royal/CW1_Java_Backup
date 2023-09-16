import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // System.out.println("Start");
        // try {
        //     int a = 2/0;    // ArithmeticException
        //     int b = Integer.parseInt("abc"); // NumberFormatException
        // } catch (ArithmeticException e) {
        //     System.out.println("Exception: " + e.getMessage());
        // } catch (NumberFormatException e) {
        //     System.out.println("Exception: " + e.getMessage());
        // } finally { // the code inside finally block will always be executed
        //     System.out.println("Finally block");
        // }
        // System.out.println("End");

        // System.out.println("Start");
        //try finally block
        // try {
        //     int a = 2/0;    // ArithmeticException
        //     int b = Integer.parseInt("abc"); // NumberFormatException
        // } finally { // the code inside finally block will always be executed
        //     System.out.println("Finally block");
        // }
        // System.out.println("End");

        // System.out.println("Start");
        // //try with nested catch block
        // try {
        //     // int a = 2/0;    // ArithmeticException
        //     // int b = Integer.parseInt("abc"); // NumberFormatException
            
        //     //try_resource block
        //     System.out.println("Start of try_resource block");
        //     try (Scanner sc = new Scanner(System.in)) {
        //         int c = sc.nextInt();   // InputMismatchException
        //     } catch (InputMismatchException e) {
        //         System.out.println("Exception: " + e.getMessage());
        //     }
        //     System.out.println("End of try_resource block");

        // } catch (ArithmeticException e) {
        //     System.out.println("Exception: " + e.getMessage());
        // }
        // System.out.println("End");

        // System.out.println("Start");
        // TryCatch obj = new TryCatch();
        // obj = null;
        // System.gc();    // calling garbage collector
        // System.out.println("garbage collector called");
        // System.out.println("End");


        TryCatch obj = new TryCatch();
        try {
            obj.method1();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }


    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");
    }

    public void method1() throws Exception {
        throw new Exception("Exception thrown from method1");
    }
}

/*
Compiler time error: the errors which are detected by the compiler.
Run time error: the errors which are detected by the JVM at the time of execution.

1. try catch block
2. try catch finally block
3. try finally block
4. try with multiple catch block
5.  final (constant: used to make things constant), 
    finally(block: used to execute code after try catch block), 
    finalize(method: used to perform clean up processing just before object is garbage collected)
6. throw, throws
7. custom exception


*/