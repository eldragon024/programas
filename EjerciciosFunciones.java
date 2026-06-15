public class EjerciciosFunciones {

    public static void main(String[] args) {
        // --- PRUEBA DE LOS EJERCICIOS ---
        
        System.out.println("--- Ejercicio 1 ---");
        saludarAmigo();
        
        System.out.println("\n--- Ejercicio 2 ---");
        saludarPersona("Carlos");
        
        System.out.println("\n--- Ejercicio 3 ---");
        int numeroFactorial = 5;
        System.out.println("El factorial de " + numeroFactorial + " es: " + calcularFactorial(numeroFactorial));
        
        System.out.println("\n--- Ejercicio 4 ---");
        double cantidadOriginal = 100.0;
        // Prueba pasando un IVA del 16%
        System.out.println("Total con 16% de IVA: " + calcularTotalFactura(cantidadOriginal, 16));
        // Prueba sin pasar el IVA (debería aplicar 21% por defecto)
        System.out.println("Total sin especificar IVA (aplica 21%): " + calcularTotalFactura(cantidadOriginal));
        
        System.out.println("\n--- Ejercicio 5 ---");
        double radio = 3.5;
        double altura = 10.0;
        double areaCirculo = calcularAreaCirculo(radio);
        double volumenCilindro = calcularVolumenCilindro(radio, altura);
        
        System.out.println("El área del círculo con radio " + radio + " es: " + areaCirculo);
        System.out.println("El volumen del cilindro con altura " + altura + " es: " + volumenCilindro);
    }

    // ==========================================
    // EJERCICIO 1: Saludo simple
    // ==========================================
    public static void saludarAmigo() {
        System.out.println("¡Hola amigo!");
    }

    // ==========================================
    // EJERCICIO 2: Saludo personalizado
    // ==========================================
    public static void saludarPersona(String nombre) {
        System.out.println("¡hola " + nombre + "!");
    }

    // ==========================================
    // EJERCICIO 3: Factorial de un número entero
    // ==========================================
    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser un entero positivo.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiplica acumulativamente: 1 * 2 * 3...
        }
        return factorial;
    }

    // ==========================================
    // EJERCICIO 4: Calcular factura con IVA
    // ==========================================
    
    // Función principal: Recibe cantidad y el porcentaje de IVA especificado
    public static double calcularTotalFactura(double cantidadSinIva, double porcentajeIva) {
        double totalIva = cantidadSinIva * (porcentajeIva / 100.0);
        return cantidadSinIva + totalIva;
    }

    // Sobrecarga de la función: Si no se manda el IVA, llama a la anterior usando 21
    public static double calcularTotalFactura(double cantidadSinIva) {
        return calcularTotalFactura(cantidadSinIva, 21.0);
    }

    // ==========================================
    // EJERCICIO 5: Área de círculo y volumen de cilindro
    // ==========================================
    
    // Función para el área del círculo
    public static double calcularAreaCirculo(double radio) {
        // Fórmula: π * r²
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para el volumen usando la función de arriba
    public static double calcularVolumenCilindro(double radio, double altura) {
        // Fórmula: Área de la base (círculo) * altura
        double areaBase = calcularAreaCirculo(radio); 
        return areaBase * altura;
    }
}