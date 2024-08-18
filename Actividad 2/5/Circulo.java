public class Circulo {
    // atributo
    public double radio;

    // constructor de objeto
    public Circulo(double radio) {
        this.radio = radio;
    }

    // metodo que calcula el area
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}