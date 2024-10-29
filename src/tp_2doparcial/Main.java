package tp_2doparcial;

public class Main {

    public static void main(String[] args) {
        
        String[] arbol ;
        int[] indices = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14}; // Array de índices de ejemplo para recorrer
        
        Arbol arbolito = new Arbol(15);
        Pregunta preg = new Pregunta(15);
        
        arbol = preg.cargaPreg();
        arbolito.cargarArbol(arbol);
        
        
        
        // Imprimimos las preguntas de acuerdo a los índices
        for (int indice : indices) {
            System.out.println(preg.getPregunta(indice)); // Llama al método que obtiene la pregunta por índice
        }
        
        
        
    }
    
}
