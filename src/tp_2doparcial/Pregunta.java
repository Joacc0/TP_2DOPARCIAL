package tp_2doparcial;

public class Pregunta {

    private String[] array;

    public Pregunta(int tamanio) {

        array = new String[tamanio];
        for (int i = 0; i < tamanio; i++) {
            array[i] = "n/";
        }
    }

    public String[] cargaPreg() {
        // Nivel 0 (Raíz)
        array[0] = "[Inserte 1 o 2 para seguir avanzando] 1: Buscar comida / 2: Buscar refugio?";

        // Nivel 1
        array[1] = "[Inserte 1 o 2 para seguir avanzando] 1: Construir un refugio / 2: Buscar una cueva?";
        array[2] = "[Inserte 1 o 2 para seguir avanzando] 1: Cazar / 2: Recolectar?";

        // Nivel 2
        array[3] = "[Inserte 1 o 2 para seguir avanzando] 1: Usar ramas / 2: Usar piedras?";
        array[4] = "[Inserte 1 o 2 para seguir avanzando] 1: Explorar / 2: Seguir buscando?";
        array[5] = "[Inserte 1 o 2 para seguir avanzando] 1: Usar una lanza / 2: Usar una trampa?";
        array[6] = "[Inserte 1 o 2 para seguir avanzando] 1: Buscar en el suelo / 2: Buscar en el arbol?";

        // Nivel 3
        array[7] = "[Inserte 1 o 2 para seguir avanzando] 1: Usar ramas secas / 2: Usar hojas de palmera?";
        array[8] = "[Inserte 1 o 2 para seguir avanzando] 1: Construyes una plataforma / 2: Construyes sobre la arena?";
        array[9] = "[Inserte 1 o 2 para seguir avanzando] 1: Exploras solo la entrada / 2: Exploras mas alla buscando objetos utiles?";
        array[10] = "[Inserte 1 o 2 para seguir avanzando] 1: Miras alrededor / 2: buscas más adentro.";
        array[11] = "[Inserte 1 o 2 para seguir avanzando] 1: Entras al agua con la lanza / 2: Pescas desde la orilla.";
        array[12] = "[Inserte 1 o 2 para seguir avanzando] 1: Construyes una red / 2: Construyes una cesta.";
        array[13] = "[Inserte 1 o 2 para seguir avanzando] 1: Pruebas bayas desconocidas / 2: Sigues buscando más lejos.";
        array[14] = "[Inserte 1 o 2 para seguir avanzando] 1: Trepas arboles para buscar / 2: Solo arbustos y en el suelo.";

        // Nivel 4 (Hojas - Resultados finales)
        array[15] = "Exito, lograste sobrevivir";
        array[16] = "Fracaso, no lograste sobrevivir";
        array[17] = "Exito, lograste sobrevivir";
        array[18] = "Fracaso, no lograste sobrevivir";
        array[19] = "Exito, lograste sobrevivir";
        array[20] = "Fracaso, no lograste sobrevivir";
        array[21] = "Exito, lograste sobrevivir";
        array[22] = "Fracaso, no lograste sobrevivir";
        array[23] = "Fracaso, no lograste sobrevivir";
        array[24] = "Exito, lograste sobrevivir";
        array[25] = "Fracaso, no lograste sobrevivir";
        array[26] = "Exito, lograste sobrevivir";
        array[27] = "Fracaso, no lograste sobrevivir";
        array[28] = "Exito, lograste sobrevivir";
        array[29] = "Fracaso, no lograste sobrevivir";
        array[30] = "Fracaso, no lograste sobrevivir";

        return array;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "array=" + array + '}';
    }

}
