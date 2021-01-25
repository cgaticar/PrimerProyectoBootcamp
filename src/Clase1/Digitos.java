package Clase1;

import java.util.Scanner;

//Resolucion: Lo pasamos a string y contador que incrementa cuando el nro cumpla con la condicion

public class Digitos {
    public static int charCont(String s, char c)
    {
        int cont = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                cont++;
            }
        }
        return cont;
    }
    public static boolean condicionOk(int i, int m, int d)
    {
        //String s =  String.valueOf(i);  OTRA FORMA PARA PASAR A STRING
        String s = Integer.toString(i);
        char c = (char)(d+48);
        return charCont(s, c) == m;
    }
    public static void main(String[] args) {
        System.out.println("Ingresar numero n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Ingresar numero m:");
        int m = scanner.nextInt();
        System.out.println("Ingresar numero d:");
        int d = scanner.nextInt();

        int i = 1;
        int cont = 0;

        while(cont < n)
        {
            if(condicionOk(i, m, d))
            {
                System.out.println(i);
                cont++;
            }
            i++;
        }


    }
}
