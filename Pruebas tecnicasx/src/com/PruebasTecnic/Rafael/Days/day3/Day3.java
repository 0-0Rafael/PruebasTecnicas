package com.PruebasTecnic.Rafael.Days.day3;

public class Day3 {
    /*
    *Escribe un programa en Java que encuentre el número más grande en un arreglo de números enteros.
    * Debes definir el arreglo de números en tu programa y luego encontrar el número más grande.
    * Luego, muestra el número más grande en la consola.
    *
    *
    *Instrucciones:
    *Crea un arreglo de números enteros con al menos 10 elementos.
    *Utiliza un bucle para recorrer el arreglo y encontrar el número más grande.
    *Al finalizar el bucle, muestra el número más grande en la consola.
    *
     */

    public void numMaxBucle(){
        int [] arc = {5,15,20,4,10,100,27,58,99,11};
        int max = arc[0];

        for (int i = 0; i < arc.length; i++){

            if (arc[i] > max){
                max = arc[i];

            }
        }
        System.out.println("El numero mas grande en la cadena es " + max);
    }

}
