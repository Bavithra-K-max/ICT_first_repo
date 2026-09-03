public class Calculator {
    // 1. Addition
    public double add(double a, double b) {
        return a + b;
    }

    // 2. Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // 3. Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // 4. Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
}
}

class CalcTest{
static {
System.out.println("manual test done by Bavithra K");
}
public static void main(String[] args)
{
Calculator calc = new Calculator();
 // Test Case 1: Addition
 double additionResult = calc.add(10, 5); 
System.out.println("Test Case 1 - Addition: " + additionResult);
System.out.println("Expected Result: 15.0"); 
System.out.println(additionResult == 15.0 ? "testcase is passed for add()" : "testcase is failled for add()");
System.out.println();

 // Test Case 2: Subtraction 
double subtractionResult = calc.subtract(10, 5);
System.out.println("Test Case 2 - Subtraction: " + subtractionResult);
System.out.println("Expected Result: 5.0");
System.out.println(subtractionResult == 5.0 ? "testcase is passed for subtract()" : "estcase is passed for add()"); 
System.out.println();

 // Test Case 3: Multiplication 
double multiplicationResult = calc.multiply(10, 5);
System.out.println("Test Case 3 - Multiplication: " + multiplicationResult); 
System.out.println("Expected Result: 50.0"); 
System.out.println(multiplicationResult == 50.0 ? "PASS" : "FAIL"); 
System.out.println(); 

// Test Case 4: Division 
double divisionResult = calc.divide(10, 5);
System.out.println("Test Case 4 - Division: " + divisionResult); 
System.out.println("Expected Result: 2.0");
System.out.println(divisionResult == 2.0 ? "PASS" : "FAIL");
}
}

