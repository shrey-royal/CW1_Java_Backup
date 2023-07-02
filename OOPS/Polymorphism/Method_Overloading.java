import java.util.Scanner;

public class Method_Overloading {

    public static double calc(char op, int num1, int num2) {
        double result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;

                break;
            case '*':
                result = num1 * num2;

                break;
            case '/':
                result = num1 / num2;

                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
        return result;
    }

    public static String calc(String op, int num1, int num2) {
        String result = "";
        switch (op.toUpperCase()) {
            case "POW":
                result = Math.pow(num1, num2) + "";
                break;

            case "SQRT":
                result = "" + Math.sqrt(num1);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //calculator
        // System.out.println("Enter + to add, - to subtract, * to multiply, / to divide: ");
        // // char operator = new java.util.Scanner(System.in).next().charAt(0);
        // char operator = sc.next().charAt(0);

        // System.out.println("Enter two numbers: ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // System.out.println("Result: " + calc(operator, num1, num2));


        System.out.println("Enter POW to do power, SQRT to do square root: ");
        String str = sc.next();

        if (str.equalsIgnoreCase("POW")) {
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Result: " + calc("POW", num1, num2));
        } else if (str.equalsIgnoreCase("SQRT")) {
            System.out.println("Enter a number: ");
            int num1 = sc.nextInt();
            System.out.println("Result: " + calc("SQRT", num1, 0));
        } else {
            System.out.println("Invalid Input");
        }

    }
}

/*
 * Polymorphism is an ability of an object to take many forms.
 * 
 * For Example: 
 * > Using one method to get different output/results
 * > Using a method from parent class which we can redefine and get our desired output. 
 * 
 * Method Overloading
 * Method Overriding
 * Covariant Return Type
 * super keyword
 * Instance Initializer block
 * final keyword
 * Runtime Polymorphism
 * Dynamic Binding
 * instanceof operator
 * 
 * 
 * 
 * Method Overloading: it is a way of using a single method name to perform different tasks.
 * 
 * 
 * addition of two numbers: 2 numbers -> scan -> add -> print result
 * 
 * addition of three numbers: 3 numbers -> scan -> add -> print result
 * 
 * addition of four numbers: 4 numbers -> scan -> add -> print result
 * 
 * 
 * using method overloading we can use the same method name to perform different tasks.
 * 
 * RULES of performing method overloading:
 * 1. method name should be same
 * 2. number of parameters should be different 
 * 3. type of parameters should be different
 * 4. sequence of parameters should be different
 */
