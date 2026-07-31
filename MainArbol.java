public class MainArbol {
    public static void main(String[] args) {

        Nodo raiz = new Nodo(50);

        Nodo hijoIzquierdo = new Nodo(30);
        Nodo hijoDerecho = new Nodo(70);

        Nodo nodo20 = new Nodo(20);
        Nodo nodo40 = new Nodo(40);
        Nodo nodo60 = new Nodo(60);
        Nodo nodo80 = new Nodo(80);

        raiz.izquierdo = hijoIzquierdo;
        raiz.derecho = hijoDerecho;

        hijoIzquierdo.izquierdo = nodo20;
        hijoIzquierdo.derecho = nodo40;

        hijoDerecho.izquierdo = nodo60;
        hijoDerecho.derecho = nodo80;

        System.out.println("Raíz: " + raiz.dato);
        System.out.println("Hijo izquierdo de 50: " + raiz.izquierdo.dato);
        System.out.println("Hijo derecho de 50: " + raiz.derecho.dato);

        System.out.println("Hijo izquierdo de 30: " + hijoIzquierdo.izquierdo.dato);
        System.out.println("Hijo derecho de 30: " + hijoIzquierdo.derecho.dato);

        System.out.println("Hijo izquierdo de 70: " + hijoDerecho.izquierdo.dato);
        System.out.println("Hijo derecho de 70: " + hijoDerecho.derecho.dato);
    }
}