package Clase2;

import Utils.FigurasGeometricasUtils;
import Utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        /*Contador contador = new Contador(4);
        contador.incrementar();
        System.out.println(contador.getCuenta());

        Contador contador1 = new Contador(contador);
        contador1.incrementar(2);
        System.out.println(contador1.getCuenta());
        contador1.decrementar(6);
        System.out.println(contador1.getCuenta());*/

        /*Libro hp = new Libro("JK Rowling", "Harry Potter y el caliz de fuego", (long) 12345678932L);
        System.out.println(hp);
        hp.prestamo();
        System.out.println(hp);
        hp.prestamo();
        System.out.println(hp);
        hp.devolucion();
        System.out.println(hp);*/

        /*Fraccion s = new Fraccion();
        s.suma((double) 5/2,2);
        System.out.println(s.getFraccion());
        s.suma(2,(double) 3/2);
        System.out.println(s.getFraccion());
        s.suma((double) 5/2,(double) 5/2);
        System.out.println(s.getFraccion());
        s.division(2.5, 2);
        System.out.println(s.getFraccion());
        s.division(2.5, 0);
        s.resta(0,0);
        System.out.println(s.getFraccion());*/

        /*Fecha fecha = new Fecha();
        System.out.println(fecha);
        System.out.println(fecha.showTomorrow());*/

        /*System.out.println(StringUtils.rpad("Holi", 's', 4));
        System.out.println(StringUtils.removeSpaces("H o l a"));
        System.out.println(StringUtils.ltrim("    Hola"));
        String h = "Hola   ";
        h = StringUtils.rtrim(h);
        System.out.println(h + " Length: " + h.length());
        h = "   Hola   ";
        h = StringUtils.trim(h);
        System.out.println(h + " Length: " + h.length());

        System.out.println(StringUtils.indexOfN("John|Paul|George|Ringo", '|', 2));*/

        /*FiguraGeometrica arr[] = { new Circulo(2),
                                   new Rectangulo(2,4),
                                   new Triangulo(2,5) };
        double promedio = FigurasGeometricasUtils.areaPromedio(arr);
        System.out.format("Promedio = %.3f%n", promedio);*/

        PasswordFuerte pwd = new PasswordFuerte();
        pwd.setValue("Caro8");
        System.out.println(pwd.getPassword());
        PasswordIntermedia pwd_inter = new PasswordIntermedia();
        pwd_inter.setValue("Caro1234");
        System.out.println(pwd_inter.getPassword());
        PasswordSimple pwd_simple = new PasswordSimple();
        pwd_simple.setValue("Carolina");
        System.out.println(pwd_simple.getPassword());
    }
}
