package tp_2doparcial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String[] arbol = null ;
        boolean arbolcargado = false;

        Pregunta preg = new Pregunta(24);
        Juego comenzar = new Juego();
        int opcion;

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Cargar Arbol de Preguntas");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    arbol = preg.cargaPreg();
                    arbolcargado = true;
                    break;
                case 2:
                    if (arbolcargado) {
                        comenzar.comenzarJuego(arbol);
                    } else {
                        System.out.println("Debe cargar el arbol de preguntas antes de jugar.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);

        leer.close();
    }
        
        
        
    }
    

