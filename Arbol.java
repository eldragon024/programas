import java.util.Scanner;

public class Arbol {
    static class Nodo {
        int dato;
        Nodo izquierdo;
        Nodo derecho;

        public Nodo(int dato) {
            this.dato = dato;
            izquierdo = null;
            derecho = null;
        }
    }
    Nodo raiz;
    public Arbol() {
        raiz = null;
    }
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }
    private Nodo insertarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return new Nodo(dato);
        }
        if (dato < actual.dato) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, dato);
        }
        else if (dato > actual.dato) {
            actual.derecho = insertarRecursivo(actual.derecho, dato);
        }
        return actual;
    }

    public void inorden() {
        System.out.print("Inorden: ");
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inordenRec(nodo.derecho);
        }
    }

    public void preorden() {
        System.out.print("Preorden: ");
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preordenRec(nodo.izquierdo);
            preordenRec(nodo.derecho);
        }
    }

    public void postorden() {
        System.out.print("Postorden: ");
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo);
            postordenRec(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    public void mostrarArbol() {
    System.out.println("\nEstructura del árbol:");
    mostrarRec(raiz, 0, "");
}
private void mostrarRec(Nodo nodo, int nivel, String direccion) {
    if (nodo != null) {

        mostrarRec(nodo.derecho, nivel + 1, "/");

        for (int i = 0; i < nivel; i++) {
            System.out.print("     ");
        }

        if (nivel == 0) {
            System.out.println(nodo.dato);
        } else {
            System.out.println(direccion + nodo.dato);
        }

        mostrarRec(nodo.izquierdo, nivel + 1, "\\");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();

        System.out.println("     ÁRBOL BINARIO DE BÚSQUEDA (BST)");
        System.out.print("\nDatos: ");
        String entrada = sc.nextLine();
        String[] numeros = entrada.split(",");
        for (String num : numeros) {
            arbol.insertar(Integer.parseInt(num.trim()));
        }
        System.out.println("\nÁrbol creado correctamente.");
        arbol.mostrarArbol();
        System.out.println();
        arbol.preorden();
        arbol.inorden();
        arbol.postorden();
        sc.close();
    }
}