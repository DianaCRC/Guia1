import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    // Pide al usuario el angulo en el que esta la escalera
    System.out.print ("Angulo de la escalera: ");
    double anguloGrado = leer.nextDouble();

    // Pide al uaurio que ingrese la altura de la escalera para almacenarla en la variable "Altura"
    System.out.print ("Altura de la escalera en centimteros: ");
    double altura = leer.nextDouble();
    
    // convierte el angulo en grados a radianes. 
    // Java usa radianes en estas funciones trigonometricas 
    double anguloRadianes = Math.toRadians(anguloGrado);

    //calcula la longitud de la escalera con los datos de altura y angulo, al ontener el seno del angulo dividido la altura
    double longitud = altura / Math.sin(anguloRadianes);
    
     System.out.println("La escalera tiene una longitud de " + longitud + " cm");
    
  }

  
  
}