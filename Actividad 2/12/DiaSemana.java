import java.util.*;

public class DiaSemana {
    // atributos
    private String nombre;

    // metodo
    private static final String[] DIAS_SEMANA = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

    // constructor valida la entrada y lanza una excepción si el día es inválido.
    public DiaSemana(String nombre) {
        this.nombre = nombre.toLowerCase();
        if (!Arrays.asList(DIAS_SEMANA).contains(nombre)) {
            throw new IllegalArgumentException("Dia inválido");
        }
    }
    // calcula el índice del día actual en el arreglo y devuelve una nueva instancia de DiaSemana con el día siguiente
    public DiaSemana obtenerDiaSiguiente() {
        int indice = Arrays.asList(DIAS_SEMANA).indexOf(nombre);
        return new DiaSemana(DIAS_SEMANA[(indice + 1) % DIAS_SEMANA.length]);
    }

    @Override
    public String toString() {
        return nombre;
    }
}