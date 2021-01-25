package Clase2;

import java.util.HashMap;

public class CuentaCorriente {
    private int nro_cuenta;
    private double saldo;
    private HashMap<String, Double> movimientos = new HashMap<>();
    private String c_reintegro = "Reintegro";
    private String c_transferencia = "Transferencia";
    private String c_terceros = "Transferencia de terceros";


    public CuentaCorriente()
    {
        int min = 1000;
        int max = 9999;

        nro_cuenta = (int) (Math.random() * (max - min + 1) + min);
        saldo = 0;
    }

    public CuentaCorriente(CuentaCorriente cc)
    {
        nro_cuenta = cc.getNroCuenta();
        saldo = cc.getSaldo();
    }

    public int getNroCuenta()
    {
        return nro_cuenta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public HashMap<String, Double> getMovimientos()
    {
        return movimientos;
    }

    public void showMovimientos()
    {
        for (String mov : movimientos.keySet())
        {
            System.out.println(mov + " " + movimientos.get(mov));
        }
    }

    public void ingreso(double ingreso, String concepto)
    {
        saldo += ingreso;
        movimientos.put(concepto, ingreso);

    }

    public void egreso(double egreso, String concepto)
    {
        saldo -= egreso;
        movimientos.put(concepto, egreso);
    }

    public void reintegro(double reintegro)
    {
        ingreso(reintegro, c_reintegro);
    }

    public void transferencia(double tranferencia, boolean terceros)
    {
        if(terceros)
        {
            ingreso(tranferencia, c_terceros);
        }
        else
        {
            egreso(tranferencia, c_transferencia);
        }
    }
}
