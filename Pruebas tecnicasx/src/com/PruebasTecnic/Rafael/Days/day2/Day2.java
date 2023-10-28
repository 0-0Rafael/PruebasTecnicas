package com.PruebasTecnic.Rafael.Days.day2;

public class Day2 {
    /*
        * Escribe un programa en Java que calcule la suma de todos los números impares del 1 al 100 (inclusive) y luego muestre el resultado en la consola.

        * Instrucciones:
        * Utiliza un bucle para recorrer los números del 1 al 100.
        * Dentro del bucle, verifica si cada número es impar.
        * Si el número es impar, agrégalo a la suma.
        * Al finalizar el bucle, muestra la suma de los números impares en la consola.
     */

    public void bucleSumImp(){
        for (int i = 1; i<=100; i++){
            if (i%2 !=0){
                int sum = i+=i;
                if (i==100){
                    System.out.printf(String.valueOf(sum));
                }
            }
        }

    }

}
