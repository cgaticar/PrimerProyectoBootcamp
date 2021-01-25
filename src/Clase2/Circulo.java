package Clase2;

public class Circulo extends FiguraGeometrica{
    private int radio;

    public Circulo(int radio)
    {
        setRadio(radio);
    }

    public double area()
    {
        return Math.PI*Math.pow(radio, 2);
    }

    public int getRadio()
    {
        return radio;
    }

    public void  setRadio(int radio)
    {
        this.radio = radio;
    }
}
