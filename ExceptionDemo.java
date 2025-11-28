import java.util.Scanner;

class AgeValidator {
    // Method that throws an exception
    public void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above!");
        } else {
            System.out.println("Access granted. Age = " + age);
        }
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----- Example 1: Arithmetic Exception -----
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b; // may throw ArithmeticException
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        finally {
            System.out.println("Division operation completed (with or without error).");
        }

        // ----- Example 2: Throw & Throws -----
        try {
            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();

            AgeValidator obj = new AgeValidator();
            obj.checkAge(age);   // may throw Exception
        } 
        catch (Exception e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

