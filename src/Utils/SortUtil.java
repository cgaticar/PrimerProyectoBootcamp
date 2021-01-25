package Utils;


import Clase3.Precedable;

import java.util.ArrayList;

public class SortUtil {

    //le paso un array de personas,
    //devuelvo array ordenado del tipo T
    //copio el array que le paso a otra variable para no modificar la data que le mando
    public static <T> Precedable<T>[] ordenar(Precedable<T> arr[])
    {
        Precedable<T>[] arrcopy = arr.clone();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length -1; j++)
            {
                if(arrcopy[j].precedeA((T)arrcopy[j+1]) > 0)
                {
                    Precedable<T> aux = arrcopy[j];
                    arrcopy[j] = arrcopy[j+1];
                    arrcopy[j+1] = aux;
                }
            }
        }
        return arrcopy;
    }
}
