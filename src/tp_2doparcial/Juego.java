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
                
                //En esta variable almacenamos la respuesta del usuario (1 o 2).
                int decision = leer.nextInt();
                
                if (decision == 1) {
                    //Si la opcion del usuario es 1, seguiremos por la izquierda del árbol, por lo tanto hacemos el calculo de 2 * i + 1
                    i = 2 * i + 1;
                } else if(decision == 2){
                    //Si la opcion del usuario es 2, seguiremos por la derecha del árbol, por lo tanto hacemos el calculo de 2 * i + 2
                    i = 2 * i + 2;
                } else { //Por si el usuario ingresa un valor que no sea ni 1 ni 2
                    System.out.println("Opcion no valida, vuelva a ingresar un numero.");
                }
                
                //Si el indice ya es igual o mayor que el tamaño del árbol, ya no volverá a entrar al bucle, por lo tanto le damos la devolución del juego y su resultado.
                if (i >= arbol.length) {
                    System.out.println("Fin del juego, la decision final es: " + arbol[i]);
                }
            }
        }
}
        
    
