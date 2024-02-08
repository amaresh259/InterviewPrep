package org.example;

public class VariablesInJava {
    public String s1; // instance Variable, implicitly assigned with default value of datatype
    public static String s3; // Static variable, implicitly assigned with default value of datatype at the time of class load
    static int a=0;
    VariablesInJava(){
    String s2 = "Ram"; // local variable, should be initialized before use
    int a;
    System.out.println("S2 local variable Value "+s2);
    System.out.println("S3 static variable value inside constructor "+s3);
    }

    //instance method
    public void m1() {
        String s2;
        int a;
        System.out.println("S3 static variable value in m1() non-static "+s3);
    }

    //Instance Block
    {
        System.out.println("S1 Value "+s1);
        System.out.println("S3 static variable value in m2 static "+VariablesInJava.s3);
    }
    //Static Block
    static{
        ++a;
        a++;
        a=10;
        int b = a;
        System.out.println("Value of b in static block "+b);

    }
    //Static method
    static void m2(){
        VariablesInJava variablesInJava = new VariablesInJava();
        System.out.println("S1 Value "+variablesInJava.s1);
        System.out.println("S3 static variable value in m2 static "+ s3);
    }

    public static void main(String[] args) {
        VariablesInJava variablesInJava = new VariablesInJava();
        System.out.println("S1 Value "+variablesInJava.s1);
        //System.out.println("S2 Value "+variablesInJava.s2);
    }
}
