package Clase3;

public class Persona implements Precedable<Persona>{

    private String nombre;
    private int dni;

    public Persona(String nombre, int dni)
    {
        setDni(dni);
        setNombre(nombre);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getDni() + ", " + getNombre();
    }

    @Override
    public int precedeA(Persona persona) {

        return this.dni - persona.getDni();

    }
}
