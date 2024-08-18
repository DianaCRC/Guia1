import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // pide al usuario introducir las sillas que hay por cada bus
        System.out.print("Ingrese numero de sillas que tiene el bus: ");
        int sillasBus = lectura.nextInt();
        
        // pide al usuario la cantidad de estudiantes gordos
        System.out.print("Ingrese numero de estudiantes gordos: ");
        int estudiantesGordos = lectura.nextInt();
        
        // pide al usuario la cantidad de estudiantes flacos
        System.out.print("Ingrese numero de estudiantes flacos: ");
        int estudiantesFlacos = lectura.nextInt();
        
        // se calculan con las variables ya recogidas, los buses necesarios por el metodo de la clase Paseo
        int busesNecesarios = Paseo.calcularBusesNecesarios(sillasBus, estudiantesGordos, estudiantesFlacos);
        
        
        System.out.println("Se necesita alquilar " + busesNecesarios + " buses para el paseo");
        
        
        lectura.close();
    }
}

   