import java.util.Scanner;

public class FibonacciRecursivo {

    // Método recursivo para obtener el número de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    // Método recursivo para sumar la sucesión
    public static int sumaFibonacci(int n) {
        if (n == 0) {
            return fibonacci(0);
        } else {
            return fibonacci(n) + sumaFibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("===== SISTTEMA DE fIBONACCI =====");
        System.out.print("¿Cuántos términos de la sucesión de Fibonacci deseas mostrar?: ");
        int n = leer.nextInt();

        System.out.println("\nSucesión de Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\nSuma de la sucesión: " + sumaFibonacci(n - 1));

        leer.close();
    }
}