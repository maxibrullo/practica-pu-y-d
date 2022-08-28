package proyecto;

import proyecto.Dia;

public class Semana
{
    // Representa la Semana como un conjunto de d�as de Lunes a Viernes
    public static final int DIAS_AGENDABLES_POR_SEMANA = 5;
    
    // Un n�mero de semana dentro de un a�o (0-52).
    private final int semanaNumero;
    private final Dia[] dias;

    public Semana(int semanaNumero)
    {
        this.semanaNumero = semanaNumero;
        dias = new Dia[DIAS_AGENDABLES_POR_SEMANA];
        int diaEnAnio = semanaNumero * 7 + 1;
        for(int dia = 0; dia < DIAS_AGENDABLES_POR_SEMANA; dia++) {
            dias[dia] = new Dia(diaEnAnio);
            diaEnAnio++;
        }
    }

    public void mostrarCitas()
    {
        System.out.println("*** Semana " + semanaNumero + " ***");
        for(Dia dia : dias) {
            dia.mostrarCitas();
        }
    }

    public Dia getDia(int diaEnSemana)
    {
        if(diaEnSemana >= 1 && diaEnSemana <= DIAS_AGENDABLES_POR_SEMANA) {
            return dias[diaEnSemana - 1];
        }
        else {
            return null;
        }
    }

    public int getSemanaNumero()
    {
        return semanaNumero;
    }
}
