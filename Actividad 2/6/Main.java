import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // ingreso de los datos
        System.out.print("Ingrese la longitud del lado A: ");
        double ladoA = leer.nextDouble();

        System.out.print("Ingrese la longitud del lado B : ");
        double ladoB = leer.nextDouble();

        System.out.print("Ingrese la longitud del lado C : ");
        double ladoC = leer.nextDouble();

        // creacion de nuevo objeto
        Terreno terreno = new Terreno(ladoA, ladoB, ladoC);

        // impresion en pantalla de los calculos hechos para hallar area y perimetro
        System.out.println("El area total del terreno es: " + terreno.calcularAreaTotal());
        System.out.println("El perimetro del terreno es: " + terreno.calcularPerimetro());

        leer.close();
    }
}