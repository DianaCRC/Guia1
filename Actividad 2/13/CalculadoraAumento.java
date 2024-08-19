import java.util.*;

public class CalculadoraAumento {
    public static double calcularAumento(Empleado empleado) {
        double aumento = 0.0;
        double sueldoActual = empleado.getSueldoActual();

        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10;
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08;
        } else {
            aumento = sueldoActual * 0.05;
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();   


        Empleado empleado = new Empleado(sueldoActual);
        double aumento = CalculadoraAumento.calcularAumento(empleado);
        double nuevoSalario = empleado.getSueldoActual() + aumento;

        System.out.println("El aumento para este empleado es: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);

        scanner.close();
    }
}