package com.PruebasTecnic.Rafael.Days.day7;

public class Day7 {

    /*
    *Escribe un programa que calcule la suma de los primeros 50 números primos y muestre el resultado en la consola.
    */

    public void numPrimos() {
        boolean este;

        for (int i = 2; i <= 50; i++) {
            este = true;

            for (int c = 2; c < i; c++) {
                if (i % c == 0) {
                    este = false;
                    break;
                }
            }

            if (este) {
                System.out.println(i);
            }
        }
    }



}
