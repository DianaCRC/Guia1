import java.util.*;

public class Main {
        public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // pide ingresar el sueldo de Pedro
        System.out.print("Ingrese el sueldo de Pedro: ");
        int sueldoPedro = lectura.nextInt();

        // calcula los gastos del arriendo y comida
        int gastoArriendo = Sueldo.calcularGastoArriendo(sueldoPedro);
        int gastoComida = Sueldo.calcularGastoComida(sueldoPedro);

        // calcula cuanto dinero le queda a Pedro después de pagar el arriendo y la comida
        int dineroRestante = sueldoPedro - (gastoArriendo + gastoComida);
        
        System.out.println("Gasto de arriendo: " + gastoArriendo);
        System.out.println("Gasto de comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

        lectura.close();
    }
}
        
   