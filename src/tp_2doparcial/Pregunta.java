package tp_2doparcial;

public class Pregunta {
        
        private String[] array;
    
        public Pregunta(int tamanio){
            
            array = new String[tamanio];
                for (int i = 0; i < tamanio; i++) {
                array[i] = "n/";
            }
        }
        
        public String[] cargaPreg(){
            array[0] = "Buscar comida o refugio?.";
            array[1] = "Construir un refugio o buscar una cueva?.";
            array[2] = "Cazar o recolectar?.";
            array[3] = "Usar ramas o piedras?.";
            array[4] = "Explorar o seguir buscando?.";
            array[5] = "Usar una lanza o una trampa?.";
            array[6] = "Buscar en el suelo o en el arbol?.";
            array[7] = "Usar ramas secas u hojas de palmera?.";
            array[8] = "Piedras.";
            array[9] = "Explorar la cueva.";
            array[10] = "Seguir buscando.";
            array[11] = "Hacer una lanza.";
            array[12] = "Hacer una trampa.";
            array[13] = "Trepar el arbol.";
            array[14] = "Buscar en el suelo.";
            array[15] = "Buscar en el suelo.";
            array[16] = "Buscar en el suelo.";
            array[17] = "Buscar en el suelo.";
            array[18] = "Buscar en el suelo.";
            array[19] = "Buscar en el suelo.";
            array[20] = "Buscar en el suelo.";
            array[21] = "Buscar en el suelo.";
            
            return array;
        }

    @Override
    public String toString() {
        return "Pregunta{" + "array=" + array + '}';
    }
                
    
}
