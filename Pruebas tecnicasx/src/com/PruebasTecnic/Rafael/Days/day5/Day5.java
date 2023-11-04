package com.PruebasTecnic.Rafael.Days.day5;

public class Day5 {


    public void buclenummaxmin (){
        int [] arc = {13, 14, 414, 5, 55, 555, 2, 234, 24, 33, 43, 434, 123, 1, 23};
        int resultmin = arc[0];
        int resultmax = arc[0];

        for (int i = 0; i < arc.length; i++){

            if (arc[i]<resultmin){
                resultmin = arc[i];
            }
            if (arc[i]>resultmax){
                resultmax = arc[i];
            }

        }

        System.out.println("El numero mas pequeño es --> " + resultmin);
        System.out.println("El resultado mas grande es --> " + resultmax);

    }

}
