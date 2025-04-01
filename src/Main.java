
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int N = scanner.nextInt();
        int[] arreglo = new int[N];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < N; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Ingrese la suma objetivo:");
        int S = scanner.nextInt();

        SumaSubarreglo.encontrarSubarreglo(arreglo, S);
    }
}
