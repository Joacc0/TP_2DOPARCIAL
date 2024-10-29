package tp_2doparcial;

/**
 *
 * @author Joaco y Fer
 */
public class Arbol {
    
    private String[] Arbol;
    
    public Arbol(int capacidad) {
        Arbol= new String[capacidad];
        for (int i = 0; i < capacidad; i++) {
            Arbol[i] = "n/";
        }
    }

    public Arbol() {
        Arbol = new String[100];
        for (int i = 0; i < 100; i++) {
            Arbol[i] = "n/";
        }
    }

    public void cargarArbol(String[] array) {
        for (int i = 0; i < Arbol.length && i < array.length; i++) {
            Arbol[i] = array[i]; // Copiamos cada elemento del array de Pregunta al árbol
        }
    }
}
