package org.example.oops;

public class ThisAndSuper {
    int a;
    String s1;

    float f;

    public ThisAndSuper() {

    }
    ThisAndSuper(int a, String s1){
        this();
        this.a = a;
        this.s1 = s1;
    }

    ThisAndSuper(int a, String s1, float f){
        this(a, s1);
        this.a = a;
        this.s1 = s1;
        this.f = f;
    }

    ThisAndSuper get(){
        return this;
    }



    public static void main(String[] args) {
        ThisAndSuper ts = new ThisAndSuper(5,"Ram");
        System.out.println(ts.a +" "+ts.s1); // (5 , Ram) - (0 , Null)
        ThisAndSuper ts1 = new ThisAndSuper(5,"Ram", 5.5f);
        System.out.println(ts1.a +" "+ts1.s1+" "+ts1.f);
    }
}
