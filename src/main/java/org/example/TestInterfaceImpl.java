package org.example;

public class TestInterfaceImpl implements TestInterface, TestInterfaceDiamond{
    public static void main(String[] args) {
        TestInterface.m1();
        //TestInterfaceDiamond.m1();
        TestInterface testInterface = new TestInterfaceImpl();
        testInterface.m3();
        /*<parent interface name>.super.<parent interface method >
        It will always take precedence while calling method from parent interface in a diamond situation scenario*/
        TestInterfaceDiamond testInterfaceDiamond = new TestInterfaceImpl();
        testInterfaceDiamond.m3();
    }

    @Override
    public void m3() {
        //System.out.println("Inside TestInterfaceImpl");
        TestInterface.super.m3();
    }
}
