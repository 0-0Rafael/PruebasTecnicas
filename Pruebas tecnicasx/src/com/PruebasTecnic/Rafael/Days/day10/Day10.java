package com.PruebasTecnic.Rafael.Days.day10;

public class Day10 {

    public void sumParImpar(){

        int [] arc = {1,2,3,4,5,6,7,8,9,10};

        int min = 0;
        int max = 0;

        for (int i = 0; i < arc.length; i++){

            if (arc[i] % 2 == 0){
                max += arc[i];
            }else {
                min += arc[i];
            }
        }

        System.out.println("El la suma de los pares es  " + max + " La suma de los impares es " + min);

    }
}
