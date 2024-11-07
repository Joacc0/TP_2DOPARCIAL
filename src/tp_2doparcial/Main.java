package tp_2doparcial;

public class Main {

    public static void main(String[] args) {
        
        String[] arbol ;
        
        Pregunta preg = new Pregunta(23);
        Juego comenzar = new Juego();
        
        //Cargamos el arbol con las preguntas.
        arbol = preg.cargaPreg();
        
        //Comenzamos el juego con el arbol ya con sus preguntas.
        comenzar.comenzarJuego(arbol);
        
        
        
    }
    
}
