package controller;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Ingresar numero:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int i = 0;
        while (i <= numero)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }

    }
}
