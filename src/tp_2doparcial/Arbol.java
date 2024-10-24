package tp_2doparcial;

/**
 *
 * @author Joaco y Fer
 */
public class Arbol {
    
    private String[] array;
    
    public Arbol(){
        
    }
    
    public boolean insertarRecursivoDato(String pregunta){
        return insertarRecursivo(pregunta,0);
    }
    
    private boolean insertarRecursivo(String pregunta, int posicion, int resp){
        if (posicion >= array.length) {
            return false;
        } else if(array[posicion] == "n") {
            array[posicion] = pregunta; //clase pregunta string y un valor int, podemos utilizar hashmap
            return true;
        } else {
            if(resp ==  1){
                return insertarRecursivo(pregunta, 2 * posicion + 1);
            }
        }
    }
}
