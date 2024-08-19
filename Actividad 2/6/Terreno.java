public class Terreno {

    //atributos
    private Rectangulo rectangulo;
    private TrianguloRectangulo triangulo;

    // constructor con parametros
    public Terreno(double ladoA, double ladoB, double ladoC) {
        rectangulo = new Rectangulo(ladoB, ladoC);
        triangulo = new TrianguloRectangulo(ladoA - ladoB, ladoC);
    }

    //metodo para calcular el area
    public double calcularAreaTotal() {
        return rectangulo.calcularArea() + triangulo.calcularArea();
    }

    // metodo para calcula el perimetro de los lados A, B, C.
    public double calcularPerimetro() {
        return rectangulo.getBase() + rectangulo.getAltura() + triangulo.calcularHipotenusa();
    }
}