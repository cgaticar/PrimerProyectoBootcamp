package Clase3;

import Utils.SortUtil;

import javax.print.attribute.ResolutionSyntax;
public class Main {

    public static void main(String[] args) {
        int dni = 123456;
        String nombre = "Caro";
        Precedable<Persona> persona1 = new Persona(nombre, dni);
        Precedable<Persona> persona2 = new Persona("Magela", 234567);
        persona1.precedeA((Persona) persona2);

        Persona arr[] = {new Persona("Carolina", 10),
                         new Persona("Magela", 20)};

        Precedable<Persona> arr_result[] = SortUtil.ordenar(arr);

        for(Precedable<Persona> p: arr_result)
        {
            System.out.println(p);
        }

        System.out.println("-------------");

        Celular celulares[] = {new Celular("Carolina", 234567),
                               new Celular("Matias", 123456),
                               new Celular("Ines", 345678)};

        Precedable<Celular> cel_result[] = SortUtil.ordenar(celulares);

        for(Precedable<Celular> c: cel_result)
        {
            System.out.println(c);
        }
    }

}
