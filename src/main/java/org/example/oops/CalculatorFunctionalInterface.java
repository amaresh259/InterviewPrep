package org.example.oops;

/*Here, Calculator is a functional interface with the abstract method operate.
The @FunctionalInterface annotation is optional but serves as a documentation aid and ensures that
the interface has only one abstract method.*/
@FunctionalInterface
public interface CalculatorFunctionalInterface {
    int operate(int a, int b);

    // This is optional, as it is a default method
    default double squareRoot(int a) {
        return Math.sqrt(a);
    }
}
