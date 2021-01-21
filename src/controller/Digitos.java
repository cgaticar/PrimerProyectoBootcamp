package controller;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        System.out.println("Ingresar numero n:");
        Scanner scanner = new Scanner(System.in);
        int numeron = scanner.nextInt();
        System.out.println("Ingresar numero m:");
        int numerom = scanner.nextInt();
        System.out.println("Ingresar numero d:");
        int numerod = scanner.nextInt();
        recursion(5467);

    }
    public static void recursion(int number) {
        if(number > 0) {
            recursion(number/10);
            System.out.println(String.valueOf(number%10));
        }
    }
}
