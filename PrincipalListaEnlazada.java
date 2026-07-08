import java.util.Scanner;

public class PrincipalListaEnlazada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        Busqueda busqueda = new Busqueda();

        int opcion;
        String dato;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Buscar un dato");
            System.out.println("5. Eliminar un dato");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Dato: ");
                    dato = teclado.nextLine();
                    lista.agregarNodoInicio(dato);
                    break;

                case 2:
                    System.out.print("Dato: ");
                    dato = teclado.nextLine();
                    lista.agregarFinal(dato);
                    break;

                case 3:
                    System.out.println("\nContenido de la lista:");
                    lista.recorrido();
                    break;

                case 4:
                    System.out.print("Dato a buscar: ");
                    dato = teclado.nextLine();

                    if (busqueda.buscar(lista, dato)) {
                        System.out.println("Dato encontrado.");
                    } else {
                        System.out.println("Dato no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Dato a eliminar: ");
                    dato = teclado.nextLine();

                    if (lista.eliminarNodo(dato)) {
                        System.out.println("Dato eliminado.");
                    } else {
                        System.out.println("Dato no existe.");
                    }
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        teclado.close();
    }
}