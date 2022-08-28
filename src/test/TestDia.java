package test;
import proyecto.Cita;
import proyecto.Dia;

public class TestDia {
    public static void main(String[] args) {
        System.out.println("Prueba de carga de citas y muestra de citas");
        Cita cita1 = new Cita("Turno medico", 1);
        Cita cita2 = new Cita("Visita amigos", 1);
        Cita cita3 = new Cita("Lavar auto", 1);
        Cita citaSobreescrita = new Cita("Sobreescrito", 1);
        Dia dia = new Dia(75);
        System.out.println("Se guardo la cita " + cita1.getDescripcion() + ": " + dia.anotarCita(9, cita1));
        System.out.println("Se guardo la cita " + cita2.getDescripcion() + ": " + dia.anotarCita(13, cita2));
        System.out.println("Se guardo la cita " + cita3.getDescripcion() + ": " + dia.anotarCita(17, cita3));
        dia.mostrarCitas();
        System.out.println();
        System.out.println("Prueba que controla que no se sobreescriba una cita a la misma hora");
        System.out.println("Sobreescritura " + cita1.getDescripcion() + ": " + dia.anotarCita(9, citaSobreescrita));
        System.out.println("Sobreescritura " + cita2.getDescripcion() + ": " + dia.anotarCita(13, citaSobreescrita));
        System.out.println("Sobreescritura " + cita3.getDescripcion() + ": " + dia.anotarCita(17, citaSobreescrita));
        System.out.println("Sobreescritura " + citaSobreescrita.getDescripcion() + ": " + dia.anotarCita(14, citaSobreescrita));

        dia.mostrarCitas();

        Cita citaFH1 = new Cita("Turno oftalmologo", 1);
        Cita citaFH2 = new Cita("Turno pediatra", 1);
        System.out.println("Se guardo la cita " + citaFH1.getDescripcion() + ": " + dia.anotarCita(8, citaFH1));
        System.out.println("Se guardo la cita " + citaFH2.getDescripcion() + ": " + dia.anotarCita(18, citaFH1));

        }
}
