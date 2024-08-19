import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ingreso de datos
        System.out.print("Ingrese el primer numero: ");
        int primerNumero = scanner.nextInt();

        //creacion de objeto numero 1
        Numero num1 = new Numero(primerNumero);

        // ingreso de datos
        System.out.print("Ingrese el segundo numero: ");
        int segundoNumero = scanner.nextInt();
        //creacion de objeto numero 2
        Numero num2 = new Numero(segundoNumero);

        int mayor = Comparador.encontrarMayor(num1, num2);
        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}