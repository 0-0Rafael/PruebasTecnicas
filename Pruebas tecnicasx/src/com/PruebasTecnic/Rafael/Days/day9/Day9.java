package com.PruebasTecnic.Rafael.Days.day9;

public class Day9 {



    public void secondnnum (){

        /*
        *Escribe un programa en Java que encuentre el segundo número más grande en un arreglo de números enteros. Debes definir el arreglo de números en tu programa
        *  y luego encontrar el segundo número más grande. Luego, muestra el resultado en la consola.
         */


        int [] arc = {42, 19, 73, 8, 56, 92, 31, 67, 14, 60, 25, 88, 37, 48, 10, 84, 21, 52, 99, 45, 93};
        int first = arc[0];
        int second = 0;


        for (int i = 1; i < arc.length; i++ ){

            if (arc[i] > first){
                second = first;
                first = arc[i];

            } else if (arc[i] > second && arc[i] < first) {
                second = arc[i];
            }

        }

        for (int i = 0; i < arc.length; i++){

        }
        System.out.println("El segundo numero mas alto es  " + second);
    }
}
