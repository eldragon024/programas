import java.util.LinkedList;
import java.util.Queue;

public class FilaPersonas {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Agregar 5 personas
        fila.add("Ana");
        fila.add("Luis");
        fila.add("Carlos");
        fila.add("María");
        fila.add("Sofía");

        // Mostrar quién está al frente
        System.out.println("Persona al frente: " + fila.peek());

        // Atender (eliminar) a dos personas
        System.out.println("Atendiendo a: " + fila.poll());
        System.out.println("Atendiendo a: " + fila.poll());

        // Mostrar cola restante
        System.out.println("\nCola restante:");
        System.out.println(fila);
    }
}