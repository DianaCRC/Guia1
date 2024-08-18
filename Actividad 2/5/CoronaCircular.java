public class CoronaCircular {

    // atributos
    public Circulo circuloInterior;
    public Circulo circuloExterior;

    // constructor de objeto
    // toma valores de los varios y crea dos objetos
    public CoronaCircular(double radioInterior, double radioExterior) {
        circuloInterior = new Circulo(radioInterior);
        circuloExterior = new Circulo(radioExterior);
    }

    // metodo que calcula el area 
    public double calcularArea() {
        return circuloExterior.calcularArea() - circuloInterior.calcularArea();
    }
}