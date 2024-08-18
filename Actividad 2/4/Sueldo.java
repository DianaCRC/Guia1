
public class Sueldo {
    // metodo que calcula el gasto en arriendo 
    public static int calcularGastoArriendo(int sueldoPedro) {
    return (int) (sueldoPedro * 0.40);  // hace la operacion para obtener el 40%, pero devuelve en numero entero
    }

    // metodo que calcula el gasto en comida 
    public static int calcularGastoComida(int sueldoPedro) {
        return (int) (sueldoPedro * 0.15); // hace la operacion para obtener el 15%, pero devuelve en numero entero
    }
}
        
   