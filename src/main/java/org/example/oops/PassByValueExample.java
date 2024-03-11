package org.example.oops;

public strictfp class PassByValueExample {
    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x);
        System.out.println("Primitive after modification: " + x); // Output: 5

        StringBuilder str = new StringBuilder("Hello");
        modifyReference(str);
        System.out.println("Reference after modification: " + str); // Output: Hello World

        String str1 = new String("Hello");
        modifyReferenceString(str1);
        System.out.println("Reference after modification: " + str1); // Output: Hello

        Integer i = 1;
        modifyNonPrimitive(i);
        System.out.println("Primitive after modification: " + i);

    }

    private static void modifyNonPrimitive(Integer i) {
        i = 10;
    }

    private static void modifyReferenceString(String str) {
        str.concat(" world");
    }

    public static void modifyPrimitive(int num) {
        num = 10;
    }

    public static void modifyReference(StringBuilder sb) {
        sb.append(" World");
    }
}

