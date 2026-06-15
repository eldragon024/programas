public class Fibonacci {
    public static void main(String[] args) {
        int n = 50; 
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}