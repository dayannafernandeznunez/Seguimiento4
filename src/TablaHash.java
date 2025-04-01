

import java.util.HashMap;

public class TablaHash {
    private HashMap<Integer, Integer> tabla;

    public TablaHash() {
        tabla = new HashMap<>();
    }

 
    public void insertar(int valor, int indice) {
        tabla.put(valor, indice);
    }

 
    public boolean contiene(int valor) {
        return tabla.containsKey(valor);
    }
 
    public int obtenerIndice(int valor) {
        return tabla.getOrDefault(valor, -1); // Si no existe, devuelve -1
    }
}
