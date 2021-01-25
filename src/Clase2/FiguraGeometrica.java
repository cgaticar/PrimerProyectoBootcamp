package Clase2;

public abstract class FiguraGeometrica {
   public abstract double area();

    @Override
    public String toString() {
        return "Area = " + area();
    }
}
