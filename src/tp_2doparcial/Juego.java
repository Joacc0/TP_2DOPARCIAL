package tp_2doparcial;

import java.util.Scanner;

public class Juego {
    
    Scanner leer = new Scanner(System.in);
    
    public Juego(){
        
    }
    
    public void comenzarJuego(String[] arbol){
        int i = 0;
    
        System.out.println("Bienvenido al Juego de Supervivencia!");
        System.out.println("Tendras que ir tomando decisiones y en base a ello veremos si sobrevives o fracasas!.");
        System.out.println("");
            
            while(i < arbol.length){
                
                System.out.println(arbol[i]);
                System.out.println("Inserta 1 si quieres buscar comida o 2 si prefieres buscar un refugio.");
                int decision = leer.nextInt();
                
                if (decision == 1) {
                    i = 2 * i + 1;
                } else if(decision == 2){
                    i = 2 * i + 2;
                } else {
                    System.out.println("Opcion no valida, vuelva a ingresar un numero.");
                }
                
                if (i >= arbol.length) {
                    System.out.println("Fin del juego, la decision final es: " + arbol[i]);
                }
            }
        }
}
        
    
