package tp_2doparcial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String[] arbol ;
         
         Scanner leer = new Scanner(System.in);
        
        Pregunta preg = new Pregunta(22);
        Juego comenzar = new Juego();
        
        //Cargamos el arbol con las preguntas.
        arbol = preg.cargaPreg();
        
        //Comenzamos el juego con el arbol ya con sus preguntas.
        comenzar.comenzarJuego(arbol);
        
        
        
    }
    
}
