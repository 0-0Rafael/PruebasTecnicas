package com.PruebasTecnic.Rafael.Days.day1;

public class Day1 {
    /*
    *Utiliza un bucle para recorrer los números del 1 al 10.
    *Dentro del bucle, verifica si cada número es par.
    *Si el número es par, imprímelo en la consola.
     */


    public void bucleImpar(){
        for(int i = 1; i<=10; i++){
            if (i % 2 == 0){
                System.out.printf( i + " El numero es par\n");
            }
        }
    }


}
