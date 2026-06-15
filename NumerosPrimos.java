public class NumerosPrimos {

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {

            boolean esPrimo = true;

            // El 1 no es primo
            if (num <= 1) {
                esPrimo = false;
            } else {

                // Comprobar divisores
                for (int i = 2; i < num; i++) {

                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            // Imprimir si es primo
            if (esPrimo) {
                System.out.println(num);
            }
        }
    }
}