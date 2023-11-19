package com.PruebasTecnic.Rafael.Days.day8;

public class Day8 {

    /*
    * Escribe un programa en Java que determine si un arreglo de números enteros está ordenado de manera ascendente,
    * descendente o de manera desordenada. Debes definir el arreglo de números en tu programa y luego determinar
    * su orden. Luego, muestra el resultado (ascendente, descendente o desordenado) en la consola.
     */

  public void ascent (){
      int[] arc = {1, 2, 5, 7, 8, 4, 10};
      int point = arc[0];
      boolean ascendente = false;
      boolean descendente = false;

      for (int i = 1; i < arc.length; i++){

          if (point < arc[i]){
              point = arc[i];
              ascendente = true;
          } else if (point > arc[i]) {
              point = arc[i];
              descendente = true;
          }

      }

      if (ascendente == true && descendente == false ){
          System.out.println("El arreglo es ascendente");
      } else if (ascendente == false && descendente == true) {
          System.out.println("El arreglo es descendente");
      }else {
          System.out.println("El arreglo no tiene orden");
      }

  }

}
