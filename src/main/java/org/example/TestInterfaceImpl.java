package org.example;

public class TestInterfaceImpl implements TestInterface, TestInterfaceDiamond{
    public static void main(String[] args) {
        TestInterface.m1();
        TestInterfaceDiamond.m1();
        TestInterface t1 = new TestInterfaceImpl();
        t1.m3();
        TestInterfaceDiamond testInterfaceDiamond = new TestInterfaceImpl();
        testInterfaceDiamond.m3();
    }

    @Override
    public void m3() {
        System.out.println("Inside TestInterfaceImpl");
        TestInterfaceDiamond.super.m3();
    }
}
