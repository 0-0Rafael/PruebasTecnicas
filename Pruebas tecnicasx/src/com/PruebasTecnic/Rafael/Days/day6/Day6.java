package com.PruebasTecnic.Rafael.Days.day6;

public class Day6 {

    /*
    *0 1 1 2 3 5 8 13 21 34 55 89 144
    */

    public void buclefibonacci (){

        int A = 0;
        int B = 1;

        for (int i = 0; i <=20 ; i++){
            System.out.println(A);
            int temp = A;
            A = B;
            B = temp + B;
        }
    }

}
