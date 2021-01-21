package controller;

import java.util.Scanner;

public class MostrarPrimos {
    public static void esPrimo(int a)
    {
        int i = 2;
        boolean primo = true;

        while (primo && i < a)
        {
            if(a % i == 0)
            {
                primo = false;
            }
            i++;
        }

        if(primo)
        {
            System.out.println(a);
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("Ingresar numero:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int i = 1;
        while (i <= numero)
        {
            esPrimo(i);
            i++;
        }
    }

}
