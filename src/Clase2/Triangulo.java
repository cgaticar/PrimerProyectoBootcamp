package Clase2;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura)
    {
        setBase(base);
        setAltura(altura);
    }

    public double area()
    {
        return (base*altura)/2;
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
