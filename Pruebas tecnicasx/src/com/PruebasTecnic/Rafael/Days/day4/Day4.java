package com.PruebasTecnic.Rafael.Days.day4;

public class Day4 {

    int [] arc ={2, 15, 24, 44, 54, 23, 11, 123, 30, 50, 25};
    int pares = 0;
    int impares = 0;

    public void buclesumsep(){

        for (int i = 0; i < arc.length; i++){

            if (arc[i] % 2 == 0){
                pares += arc[i];
            }else {
                impares+= arc[i];
            }

        }

        System.out.println("La suma de todos los pares es " + pares);
        System.out.println("La suma de todos loss impares es " + impares);
    }
}
