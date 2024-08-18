

public class Paseo {
    
    // metodo para calcular el total de buses
    public static int calcularBusesNecesarios(int sillasBus, int estudiantesGordos, int estudiantesFlacos) {
       
        
        int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;
        
        int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasBus);
        
        return busesNecesarios;
    }
}

   