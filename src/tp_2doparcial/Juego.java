package tp_2doparcial;

import java.util.Scanner;

public class Juego {
    
    Scanner leer = new Scanner(System.in);
    
    public Juego(){
        
    }
    
    public void comenzarJuego(String[] arbol){
        //Indice del arbol para ir corriendo.
        int i = 0;
    
        System.out.println("Bienvenido al Juego de Supervivencia!");
        System.out.println("Tendras que ir tomando decisiones y en base a ello veremos si sobrevives o fracasas!.");
        System.out.println("");
            
            //Mientras que el indice no sea más grande que el tamaño del árbol, seguira entrando en el bucle
            while(i < arbol.length){
                
                //Lee la pregunta del indice
                System.out.println(arbol[i]);
                
                //Verificamos si hemos llegado a la hoja o no.
                if (arbol[i].contains("Exito") || arbol[i].contains("Fracaso")) {
                break;
                }
                
                // Solicitamos una decisión válida (1 o 2)
                int decision = 0;
                while (decision != 1 && decision != 2) {
                System.out.print("Ingrese su decision (1 o 2): ");
                if (leer.hasNextInt()) {
                    decision = leer.nextInt();
                    if (decision != 1 && decision != 2) {
                        System.out.println("Opción no válida. Solo puede ingresar 1 o 2.");
                    }
                } else {
                    System.out.println("Entrada no válida. Solo puede ingresar números.");
                    leer.next(); // Limpiar la entrada no numérica
                }
            }
                
                // Calcula el próximo índice según la decisión tomada
            i = (decision == 1) ? 2 * i + 1 : 2 * i + 2;
            }
        }
}
        
    
