package proyecto;

import proyecto.Cita;

public class Dia
{
    public static final int PRIMER_HORA = 9;
    public static final int ULTIMA_HORA = 17;
    public static final int MAX_CITAS_POR_DIA =
                                ULTIMA_HORA -
                                PRIMER_HORA + 1;
    private int diaNumero;
    private Cita[] citas;
    public Dia(int diaNumero)
    {
        this.diaNumero = diaNumero;
        citas = new Cita[MAX_CITAS_POR_DIA];
    }
    public int bucarEspacio(Cita cita)
    {
        int duracion = cita.getDuracion();
        for(int fila = 0; fila < MAX_CITAS_POR_DIA; fila++) {
            if(citas[fila] == null) {
                final int hora = PRIMER_HORA + fila;
                if(duracion == 1) {
                    return hora;
                }
                else {
                    int cantidad_de_filas_requeridas = duracion - 1;
                    for(int filaSiguiente = fila + 1;
                                cantidad_de_filas_requeridas > 0 &&
                                citas[filaSiguiente] == null;
                                    filaSiguiente++) {
                        cantidad_de_filas_requeridas--;
                    }
                    if(cantidad_de_filas_requeridas == 0) {
                        return hora;
                    }
                }
            }
        }
        return -1;
    }
    public boolean anotarCita(int hora, Cita cita)
    {
        if(horaValida(hora)) {
            int horaInicio = hora - PRIMER_HORA;
            if(citas[horaInicio] == null) {
                int duracion = cita.getDuracion();
                for(int i = 0; i < duracion; i++) {
                    citas[horaInicio + i] = cita;
                }
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public Cita getCita(int hora)
    {
        if(horaValida(hora)) {
            return citas[hora - PRIMER_HORA];
        }
        else {
            return null;
        }
    }
    public void mostrarCitas()
    {
        System.out.println("=== Dia " + diaNumero + " ===");
        int hora = PRIMER_HORA;
        for(Cita cita : citas) {
            System.out.print(hora + ": ");
            if(cita != null) {
                System.out.println(cita.getDescripcion());
            }
            else {
                System.out.println();
            }
            hora++;
        }
    }
    public int getDiaNumero()
    {
        return diaNumero;
    }
    public boolean horaValida(int hora)
    {
        return hora >= PRIMER_HORA && hora <= ULTIMA_HORA;
    }
}
