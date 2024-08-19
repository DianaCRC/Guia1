public class TrianguloRectangulo {

    //atributos
    private double cateto1;
    private double cateto2;

    // constructor con parametros
    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    //metodo que calcula el area triangulo
    public double calcularArea() {
        return (cateto1 * cateto2) / 2;
    }

    //metodo de calcular la hipotenusa del triangulo rectangulo
    public double calcularHipotenusa() {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
}
