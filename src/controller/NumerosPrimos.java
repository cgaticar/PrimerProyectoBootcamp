package controller;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Ingresar numero:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int i = 2;

        boolean primo = true;

        while (primo && i < numero)
        {
            if(numero % i == 0)
            {
                primo = false;
            }
            i++;
        }
        System.out.println(primo);
    }
}
