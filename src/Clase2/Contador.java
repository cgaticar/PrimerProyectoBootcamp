package Clase2;

public class Contador {
    private int cuenta;

    public Contador()
    {
        cuenta = 0;
    }

    public Contador(Contador copia)
    {
        cuenta = copia.getCuenta();
    }

    public Contador(int inicio)
    {
        if(inicio >= 0) setCuenta(inicio);
        else
        {
            cuenta = 0;
            System.out.println("El contador debe ser positivo. Iniciado en 0");
        }
    }

    public int getCuenta()
    {
        return cuenta;
    }

    public void setCuenta(int cuenta)
    {
        this.cuenta = cuenta;
    }

    public void incrementar()
    {
        cuenta++;
    }

    public void incrementar(int inc)
    {
        cuenta += inc;
    }

    public void decrementar()
    {
        if(cuenta>0) cuenta--;
        else System.out.println("Contador en 0");
    }

    public void decrementar(int dec)
    {
        if(cuenta>dec) cuenta -= dec;
        else System.out.println("Contador en 0");
    }

}
