import java.util.*;

public class Familia {
    // creacion de un objeto lista para almancenar objetos nuevos de clase hermano
    private List<Hermano> hermanos = new ArrayList<>();

    // metodo para guardar un nuevo hermano
    public void agregarHermano(Hermano hermano) {
        hermanos.add(hermano);
    }

    // metodo que itera sobre la lista de hermanos y devuelve el nombre del hermano con mayor edad.
    public String encontrarHermanoMayor() {
        Hermano hermanoMayor = hermanos.get(0);
        for (Hermano hermano : hermanos) {
            if (hermano.getEdad() > hermanoMayor.getEdad()) {
                hermanoMayor = hermano;
            }
        }
        return hermanoMayor.getNombre();
    }
}