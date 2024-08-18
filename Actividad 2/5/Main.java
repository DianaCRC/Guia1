import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // pide al usuario los radios (R y r)
        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = leer.nextDouble();
        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeño = leer.nextDouble();

        // se crea un nuevo objeto de la clase CoronaCircular
        // los dos circulos
        CoronaCircular corona = new CoronaCircular(radioPequeño, radioGrande);

        // se calcula el area 
        // muestra el area 
        System.out.println("La corona tiene un area de " + corona.calcularArea());

        leer.close();
    }
}