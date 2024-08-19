public class Rectangulo {

    //atributos
    private double base;
    private double altura;

    // constructor con parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodo para calcular el area del rectangulo
    public double calcularArea() {
        return base * altura;
    }
}