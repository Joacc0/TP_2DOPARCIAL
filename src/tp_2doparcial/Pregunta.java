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
            array[0] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Buscar comida / 2: Buscar refugio?.";
            array[1] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Construir un refugio / 2: Buscar una cueva?.";
            array[2] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Cazar / 2: Recolectar?.";
            array[3] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Usar ramas / 2:Usar piedras?.";
            array[4] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Explorar / 2: Seguir buscando?.";
            array[5] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Usar una lanza / 2: Usar una trampa?.";
            array[6] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Buscar en el suelo / 2: Buscar en el arbol?.";
            array[7] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Usar ramas secas / 2:Usar hojas de palmera?.";
            array[8] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Construyes una plataforma / 2: Construyes sobre la arena?.";
            array[9] = "[Inserte 1 o 2 para seguir avanzando] " + "1: Exploras solo la entrada / 2:Exploras más alla buscando objetos utiles?.";
            array[10] = "Miras al rededor o buscas más adentro";
            array[11] =  "[Inserte 1 o 2 para seguir avanzando] " + "1: Entras al agua con la lanza /2. pescas desde la orilla.";
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
