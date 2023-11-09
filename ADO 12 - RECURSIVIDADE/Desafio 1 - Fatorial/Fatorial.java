public class Fatorial {

    public int calcular(int numero) {
        
        if (numero == 1) {
            return 1;
        } else
        
        return numero * calcular(numero -1);
    }
    
}