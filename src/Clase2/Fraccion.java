package Clase2;

public class Fraccion {
    public double fraccion = 0;

    public double getFraccion()
    {
        return fraccion;
    }
    public void suma (double a, double b)
    {
        fraccion = (double) a+b;
    }

    public void suma (int a, double b)
    {
        fraccion = (double) a+b;
    }

    public void suma (double a, int b)
    {
        fraccion = (double) a+b;
    }

    public void suma (int a, int b)
    {
        fraccion = (double) a+b;
    }

    public void resta (double a, double b)
    {
        fraccion = (double) a-b;
    }

    public void resta (int a, double b)
    {
        fraccion = (double) a-b;
    }

    public void resta (double a, int b)
    {
        fraccion = (double) a-b;
    }

    public void resta (int a, int b)
    {
        fraccion = (double) a-b;
    }

    public void multiplicacion (double a, double b)
    {
        fraccion = (double) a*b;
    }

    public void multiplicacion (int a, double b)
    {
        fraccion = (double) a*b;
    }

    public void multiplicacion (double a, int b)
    {
        fraccion = (double) a*b;
    }

    public void multiplicacion (int a, int b)
    {
        fraccion = (double) a*b;
    }

    public void division (double a, double b)
    {
        if(b!=0.0) fraccion = (double) a/b;
        else
        {
            System.out.println("No se puede dividir por cero");
            fraccion = 0;
        }
    }

    public void division (int a, double b)
    {
        if(b!=0.0) fraccion = (double) a/b;
        else
        {
            System.out.println("No se puede dividir por cero");
            fraccion = 0;
        }
    }

    public void division (double a, int b)
    {
        if(b!=0) fraccion = (double) a/b;
        else
        {
            System.out.println("No se puede dividir por cero");
            fraccion = 0;
        }
    }

    public void division (int a, int b)
    {
        if(b!=0) fraccion = (double) a/b;
        else
        {
            System.out.println("No se puede dividir por cero");
            fraccion = 0;
        }
    }
}
