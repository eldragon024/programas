import java.util.Scanner;

public class ContrasenaWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Definir contraseña
        String contrasena = "carlagamer777";
        String intento = "";

        // Ciclo while
        while (!intento.equals(contrasena)) {

            System.out.print("Ingresa la contraseña: ");
            intento = entrada.nextLine();

            if (!intento.equals(contrasena)) {
                System.out.println("Contraseña incorrecta, vuelva a intentarlo >:P");
            } else {
                System.out.println("Contraseña correcta");
            }
        }

        entrada.close();
    }
}