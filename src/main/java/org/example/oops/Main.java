package org.example.oops;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main implements CalculatorFunctionalInterface, TestInterface{
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
        // Using lambda expression for addition
        //CalculatorFunctionalInterface multiplication = (a, b) -> a + b;
        CalculatorFunctionalInterface addition = Integer::sum;
        System.out.println("Addition: " + addition.operate(5, 3));

        // Using lambda expression for multiplication
        CalculatorFunctionalInterface multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(5, 3));

        CalculatorFunctionalInterface ref = new Main();
        // Using default method for square root
        System.out.println("Square of a : " + ref.squareRoot(25));
        Main m1 = new Main();
        System.out.println("Square root : " + m1.squareRootFunctionForInterface(25));
        System.out.println("Cube of a : " + m1.squareRootFunctionForInterface2(25));
    }

    @Override
    public int operate(int a, int b) {
        return 0;
    }

    public double squareRoot(int a) {
        //return a*a;
        return CalculatorFunctionalInterface.super.squareRoot(a);
    }
    public double squareRootFunctionForInterface(int a) {
        return CalculatorFunctionalInterface.super.squareRoot(a);
    }
    public double squareRootFunctionForInterface2(int a) {
        return TestInterface.super.squareRoot(a);
    }
}