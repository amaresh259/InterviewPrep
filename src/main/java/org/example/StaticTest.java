package org.example;

public class StaticTest {
    static int i = 5; // 6
    int j = 5;
    static void go(){
        i--;
        System.out.println(i); // 15
    }
    void stop(){
        i += 10; // 16
    }

    static{
        i--;  // 4
        //System.out.println("Static block "+i);
    }

    {
        j--; // 4 -> 4
        i++; // 5 -> 7
        //System.out.println("Instance block "+i);
        //System.out.println(j);
        j++; // 5 -> 5
        //System.out.println(j);
    }

    StaticTest(){
        i++; // 6 -> 8 // Static variable retain last copy
        j++; // 6 -> 6 // Instance variable update the value in every object creation
        //System.out.println("Constructor block "+i);
    }
/*
Order of calling ->
Static Block > Instance Block > Constructor >
 */
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        System.out.println(st.i);
        System.out.println(st.j);
        //System.out.println(i); //6
        //st.stop();
        //System.out.println(i); // 16
        //go();
        StaticTest st1 = new StaticTest();
        //System.out.println(st1.i); // 15
        System.out.println(st1.i);
        System.out.println(st1.j);
    }
}
