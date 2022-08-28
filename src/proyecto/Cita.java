package proyecto;

public class Cita {
    private String descripcion;
    private int duracion;
    public Cita(String descripcion, int duracion)
    {
        this.descripcion = descripcion;
        this.duracion = duracion;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public int getDuracion()
    {
        return duracion;
    }
}
