package com.PruebasTecnic.Rafael.Days.day11;

public class Day11 {

    public void mostrepe (){


        int [] arc = {1,2,1,2,1};
        int [] xd = new int[arc.length];


        for (int i = 0; i < arc.length; i++){

            for (int x = 0; x < arc.length; x++){
                if (arc[i] == arc[x]){
                    xd[i]++;
                }
            }
        }

        int maxRepetitions = 0;
        int number = 0;

        for (int y=0; y < arc.length; y++){
            if (xd[y] > maxRepetitions){
                maxRepetitions = xd[y];
                number = arc[y];
            }
        }
        System.out.println("El numero que mas se repite es " + number + " con un total de " + maxRepetitions + " Repeticiones " );
    }

}
