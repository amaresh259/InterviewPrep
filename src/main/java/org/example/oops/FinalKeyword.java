package org.example.oops;

public class FinalKeyword {
    final int x;

    FinalKeyword(){
        //x = 5;
    }

    static{
        //x = 6;
    }
    {
        x = 5;
    }


    void m1(){
        //x++; C . T Error
        //x = 6;
    }

}
