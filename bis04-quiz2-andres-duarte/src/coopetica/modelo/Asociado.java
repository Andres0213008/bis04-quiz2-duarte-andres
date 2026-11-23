package coopetica.modelo;

/*
 * Clase mínima de apoyo para que el proyecto pueda compilar de forma
 * independiente. Si ya tiene la clase Asociado de la Semana 8, conserve
 * aquella versión y sustituya esta únicamente si fuera necesario.
 */
public class Asociado {
    private String cedula;
    private String nombre;

    public Asociado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " - " + cedula;
    }
}
