import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GrafoMatriz grafo = new GrafoMatriz();

        int origen, destino;

        System.out.println("Vertices:");
        System.out.println("0 = A");
        System.out.println("1 = B");
        System.out.println("2 = C");
        System.out.println("3 = D");
        System.out.println("4 = E");

        System.out.print("¿Cuántas aristas desea ingresar?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nArista " + (i + 1));

            System.out.print("Origen: ");
            origen = sc.nextInt();

            System.out.print("Destino: ");
            destino = sc.nextInt();

            if (origen >= 0 && origen < 5 && destino >= 0 && destino < 5) {
                grafo.agregarArista(origen, destino);
            } else {
                System.out.println("Vertices inválidos.");
                i--; // Repite esta iteración
            }
        }

        grafo.mostrarMatriz();
        grafo.mostrarGrafo();

        sc.close();
    }
}