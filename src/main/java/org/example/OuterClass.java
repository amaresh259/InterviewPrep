package org.example;

/*

 */
public class OuterClass {

    int x = 5;
    static int y = 5;
    private OuterClass(){

    }
    public class InnerClass{
        void m2(){
            System.out.println("Inside InnerClass method m2"+x+" "+y);
        }
    }

    public static class InnerClass2{
        void m3(){
            System.out.println("Inside static InnerClass2 method m3");
        }
        static void m4(){
            System.out.println("Inside static InnerClass2 static method m4"+y);
        }
    }

    public void m1(){
        InnerClass nc = new InnerClass();
        nc.m2();
    }

    public static void main(String[] args) {
        new OuterClass().m1();
        new OuterClass().new InnerClass().m2();

        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        ic.m2();

        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.m3();

        InnerClass2.m4();

    }
}
