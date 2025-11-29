⚡ Java Exception Handling Demo
📌 Overview
This project is a simple Java program that demonstrates exception handling in Java using:
- try-catch-finally blocks
- throw and throws keywords
- Custom validation logic (AgeValidator)
It covers both built-in exceptions (like ArithmeticException) and user-defined exceptions.

🛠 Features
- Arithmetic Exception Example
- Handles division by zero using try-catch-finally.
- Ensures the program continues even after an error.
- Throw & Throws Example
- Uses a custom class AgeValidator to check age.
- Throws an exception if age is less than 18.
- Demonstrates how throws is declared in method signatures.

📂 Code Structure
AgeValidator.java     // Class with method that throws exception
ExceptionDemo.java    // Main class demonstrating exception handling



▶️ How to Run
- Save the code in a file named ExceptionDemo.java.
- Compile the program:
javac ExceptionDemo.java
- Run the program:
java ExceptionDemo



📊 Example Output
Case 1: Division by Zero
Enter numerator: 10
Enter denominator: 0
Error: Division by zero is not allowed!
Division operation completed (with or without error).


Case 2: Valid Division
Enter numerator: 20
Enter denominator: 5
Result = 4
Division operation completed (with or without error).


Case 3: Age Validation (Invalid Age)
Enter your age: 15
Exception Caught: Age must be 18 or above!


Case 4: Age Validation (Valid Age)
Enter your age: 22
Access granted. Age = 22




