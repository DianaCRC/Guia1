import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creacion nuevo objeto de clase scanner
        Scanner lectura = new Scanner(System.in);

        // creacion nuevo objeto de clase Familia
        Familia familia = new Familia();

        // repite el proceso tres veces para ingresar tres hermanos
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese el nombre del hermano " + i + ": ");
            String nombre = lectura.nextLine();
            System.out.print("Ingrese la edad del hermano " + i + ": ");
            int edad = lectura.nextInt();
            lectura.nextLine(); 

            // creacion de objeto de clase Hermano
            Hermano hermano = new Hermano(nombre, edad);
            familia.agregarHermano(hermano);
        }
        // utiliza el metodo de la clase Famila para encontrar el hermano mayor e imprime en pantalla el resultado
        String hermanoMayor = familia.encontrarHermanoMayor();
        System.out.println("El hermano mayor es: " + hermanoMayor);

        lectura.close();
    }
}