import java.util.*;


public class DiaSiguiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un dia de la semana: ");
        String dia = scanner.nextLine();

        DiaSemana diaSemana = new DiaSemana(dia);
        DiaSemana diaSiguiente = diaSemana.obtenerDiaSiguiente();

        System.out.println("El dia siguiente es: " + diaSiguiente);

        scanner.close();
    }
}