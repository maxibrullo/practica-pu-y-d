package test;
import proyecto.*;
/**
 * Lleva a cabo pruebas de la clase Dia que consisten en anotar citas de una hora de duracion.
 */
public class TestUnaHora {

    private Dia dia;

    /**
     * Constructor de objetos de la clase TestUnaHora.
     */
    public TestUnaHora(){
    }

    /**
     * Prueba la funcionalidad basica tanto al comienzo, final y a la mitad del dia.
     */
    public void anotarTresCitas(){
        dia = new Dia(1);
        Cita cita1 = new Cita("Turno medico", 1);
        Cita cita2 = new Cita("Visita amigos", 1);
        Cita cita3 = new Cita("Lavar auto", 1);
        dia.anotarCita(9, cita1);
        dia.anotarCita(13, cita2);
        dia.anotarCita(17, cita3);
        dia.mostrarCitas();
    }

    /**
     * Verificar que no este permitido registrar dos citas en una misma hora.
     */
    public void probardobleCita(){
        anotarTresCitas();
        Cita citaMala = new Cita("Error", 1);
        dia.anotarCita(9, citaMala);
        dia.mostrarCitas();
    }
    /**
     * Prueba la funcionalidad basica completando un dia con citas.
     */
    public void completarElDia(){
        dia= new Dia(1);
        for(int hora = Dia.PRIMER_HORA; hora <= Dia.ULTIMA_HORA; hora++){
            dia.anotarCita(hora, new Cita("prueba " + hora, 1));
        }
        dia.mostrarCitas();
    }
}
