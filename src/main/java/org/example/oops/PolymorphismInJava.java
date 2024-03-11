package org.example.oops;

import java.io.IOException;
import java.sql.SQLException;

public class PolymorphismInJava {

    String s1 = "Ram";
    void m1() throws SQLException {
        System.out.println("Parent class m1 method throws ArrayIndexOutOfBoundsException");
    }

    static void testStatic(){
        System.out.println("Parent Class testStatic");
    }

    protected void modifier(){
        System.out.println("Parent class modifier");
    }
}
