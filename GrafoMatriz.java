public class GrafoMatriz {

    String[] vertices;
    int[][] matriz;

    public GrafoMatriz() {
        vertices = new String[]{"A", "B", "C", "D", "E"};
        matriz = new int[5][5];
    }

    public void agregarArista(int origen, int destino) {
        matriz[origen][destino] = 1;
        matriz[destino][origen] = 1; // Grafo no dirigido
    }

    public void mostrarMatriz() {
        System.out.println("Matriz de adyacencia:");
        System.out.print("  ");

        for (String vertice : vertices) {
            System.out.print(vertice + " ");
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(vertices[i] + " ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void mostrarGrafo() {
        System.out.println("\nLista de adyacencia:");

        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + ": ");

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print(vertices[j] + " ");
                }
            }

            System.out.println();
        }
    }
}