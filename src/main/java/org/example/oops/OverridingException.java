package org.example.oops;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLTransactionRollbackException;

public class OverridingException extends PolymorphismInJava{

    String s1 = "Shyam";
    void m1() throws SQLTransactionRollbackException {
        System.out.println("Child class m1 method throws StringIndexOutOfBoundsException");
    }


    static void testStatic(){
        System.out.println("Child Class testStatic");
    }

    public void modifier(){
        System.out.println("Child class modifier");
    }

    public static void main(String[] args) {
        OverridingException oe = new OverridingException();
        try {
            oe.m1();
        } catch (Exception e){

        }

        System.out.println("s1 value "+oe.s1);

        testStatic();
        PolymorphismInJava.testStatic();
        oe.modifier(); // Child
        PolymorphismInJava pj = new OverridingException();
        pj.modifier(); // Child
        PolymorphismInJava pj1 = new PolymorphismInJava();
        pj1.modifier(); //Parent

        /*OverridingException oe2 = (OverridingException) pj1; // It will give class cast exception
        oe2.modifier();*/
        OverridingException oe2 = (OverridingException) pj; // It will type cast to child class object due to instance of child
        oe2.modifier();
        /*if(pj instanceof OverridingException){
            OverridingException oe2 = (OverridingException) pj;
            oe2.modifier();
        }*/
        if(pj1 instanceof OverridingException){
            OverridingException oe3 = (OverridingException) pj1;
            oe3.modifier();
        }
        /*int x = 5;
        if(x == 5){
            OverridingException oe2 = (OverridingException) pj;
            oe2.modifier();
        }*/
        /*try{
            OverridingException oe1 = (OverridingException) new PolymorphismInJava();
            oe1.modifier();
        } catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }*/

    }
}
