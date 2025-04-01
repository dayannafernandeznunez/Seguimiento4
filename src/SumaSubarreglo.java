

public class SumaSubarreglo {
    
    public static void encontrarSubarreglo(int[] arreglo, int S) {
        TablaHash tabla = new TablaHash();
        int sumaActual = 0;

        for (int i = 0; i < arreglo.length; i++) {
            sumaActual += arreglo[i];

            if (sumaActual == S) {
                System.out.println("Subarreglo encontrado en índices: (0, " + i + ")");
                return;
            }

            int complemento = sumaActual - S;
            if (tabla.contiene(complemento)) {
                System.out.println("Subarreglo encontrado en índices: (" + (tabla.obtenerIndice(complemento) + 1) + ", " + i + ")");
                return;
            }

            tabla.insertar(sumaActual, i);
        }

        System.out.println("-1 (No se encontró un subarreglo que sume " + S + ")");
    }
}
