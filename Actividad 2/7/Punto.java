
public class Punto {

    private double puntoX;
    private double puntoY;

    // constructor con parametros, porque se necesita crear un objeto con valores
    public Punto (double puntoX, double puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }

    // metodo que calcula la distancia entre dos puntos
    public double calcularDistancia(Punto unPunto) { // referecia objetos de la clase (sin la coma (,))
        double dx = this.puntoX - unPunto.puntoX; // diferencia entre las coordenadas en x
        double dy = this.puntoY - unPunto.puntoY; // diferncia entre coordenadas en y
        // calculo de raiz, cuadrados y suma
        return Math.sqrt(dx * dx + dy * dy);
    }

    // metodo para calcular la pendiente
    public double calcularPendiente(Punto unPunto) {
        double dx = this.puntoX - unPunto.puntoX; // diferencia entre las coordenadas en x
        double dy = this.puntoY - unPunto.puntoY; // diferencia entre coordenadas en y
            return dx / dy; // division entre las diferencias de los puntos
    }
}
