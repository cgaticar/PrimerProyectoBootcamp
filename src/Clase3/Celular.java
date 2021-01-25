package Clase3;

public class Celular implements Precedable<Celular>{

    private String titular;
    private int numero;

    public Celular(String titular, int dni)
    {
        setNumero(dni);
        setTitular(titular);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return getNumero() + ", " + getTitular();
    }

    @Override
    public int precedeA(Celular persona) {

        return this.numero - persona.getNumero();

    }
}
