package Clase2;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura)
    {
        setBase(base);
        setAltura(altura);
    }

    public double area()
    {
        return base*altura;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getBase()
    {
        return base;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getAltura()
    {
        return altura;
    }
}
