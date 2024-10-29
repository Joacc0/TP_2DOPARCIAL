package tp_2doparcial;

/**
 *
 * @author Joaco y Fer
 */
public class Pregunta {
        
        private String[] array;
    
        public Pregunta(int tamanio){
            
            array = new String[tamanio];
                for (int i = 0; i < tamanio; i++) {
                array[i] = "n/";
            }
            cargaPreg();
        }
        
        public String[] cargaPreg(){
            array[0] = "Buscar comida o refugio?.";
            array[1] = "Refugio.";
            array[2] = "Comida.";
            array[3] = "Construir uno.";
            array[4] = "Cueva.";
            array[5] = "Cazar.";
            array[6] = "Recolectar.";
            array[7] = "Ramas.";
            array[8] = "Piedras.";
            array[9] = "Explorar la cueva.";
            array[10] = "Seguir buscando.";
            array[11] = "Hacer una lanza.";
            array[12] = "Hacer una trampa.";
            array[13] = "Trepar el arbol.";
            array[14] = "Buscar en el suelo.";
            
            return array;
        }
        
        public String getPregunta(int posicion) {
        if (posicion >= 0 && posicion < array.length) {
            return array[posicion];
        } else {
            return "Pregunta no disponible.";
        }
    }
        
        public void Mostrar(){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array);
                System.out.println("");
            }
        }

    @Override
    public String toString() {
        return "Pregunta{" + "array=" + array + '}';
    }
                
    
}
