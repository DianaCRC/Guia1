public class Comparador {
    // metodo que compara los numeros para ver cual es mayor
    public static int encontrarMayor(Numero num1, Numero num2) {
        if (num1.getValor() > num2.getValor()) {
            return num1.getValor();
        } else {
            return num2.getValor();
        }
    }
}