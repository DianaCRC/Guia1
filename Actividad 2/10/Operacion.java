import java.util.Scanner;

public class Operacion {
        // Metodo con la operacion aritmetica
    public static double aplicarOperacion(int num1, int num2, String operador) {
        double resultado = 0;

        // comparan los diferentes casos con operadp
        switch (operador) { // switch evitar una larga serie de if-else 
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> {

                // valida que no haya division por cero
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error:Division por cero no permitida");
                }
            }
            case "%" -> resultado = num1 % num2;
            case "**" -> resultado = Math.pow(num1, num2);
            default -> System.out.println("Operador no valido");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee los dos números
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        // Lee el operador aritmetico
        System.out.print("Ingrese el operador aritmetico (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // aplica la operacion y guarda el resultado
        double resultado = aplicarOperacion(num1, num2, operador);

        
        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
        
