package controller;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        System.out.println("Ingresar numero n:");
        Scanner scanner = new Scanner(System.in);
        int numeron = scanner.nextInt();
        System.out.println("Ingresar numero m:");
        int numerom = scanner.nextInt();

        int i = 1;
        while (i <= numeron)
        {
            System.out.println(i * numerom);
            i++;
        }
        scanner.close();
    }
}
