import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        // ingreso de las coordenadas de los dos puntos
        System.out.println("Ingrese coordenada x del primer punto");
        double x1 = lectura.nextInt();
        System.out.println("Ingrese coordenada y del primer punto");
        double y1 = lectura.nextInt();

        System.out.println("Ingrese coordenada x del segundo punto");
        double x2 = lectura.nextInt();
        System.out.println("Ingrese coordenada y del segundo punto");
        double y2 = lectura.nextInt();

        // creacion de objetos con los datos obtenidos antes
        Punto punto1 = new Punto(x1,y1);
        Punto punto2 = new Punto(x2,y2);
        
        // calculo para la distancia y pendiente entre los puntos
        double distancia = punto1.calcularDistancia(punto2);
        double pendiente = punto1.calcularPendiente(punto2);

        // imprime en pantalla los resultados
        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ")  es de " + distancia);
        System.out.println("y la pendiente es de " + pendiente);

        lectura.close();
    }

}
    