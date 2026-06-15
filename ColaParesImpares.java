import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ColaParesImpares {
    public static void main(String[] args) {

        Queue<Integer> numeros = new LinkedList<>();
        Queue<Integer> pares = new LinkedList<>();
        Queue<Integer> impares = new LinkedList<>();

        Random random = new Random();

        // Generar 20 números aleatorios
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1; // números del 1 al 100
            numeros.add(num);

            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        System.out.println("Cola original:");
        System.out.println(numeros);

        System.out.println("\nCola de pares:");
        System.out.println(pares);

        System.out.println("\nCola de impares:");
        System.out.println(impares);
    }
}