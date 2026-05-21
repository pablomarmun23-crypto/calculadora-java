import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.print("===CALCULADORA===");
        System.out.print("\nIntroduce un número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Introduce otro número: ");
        double num2 = teclado.nextDouble();
        System.out.println("Elige una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("s")) {
                //main(args); // Llamar al método main para reiniciar la calculadora
                // continuar = false; // Salir del bucle después de reiniciar
            } else if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("¡Gracias por usar la calculadora!");
                continuar = false; // Salir del bucle y finalizar el programa
            } else {
                System.out.println("Respuesta no válida. Por favor, ingresa 's' o 'n'.");
            }
        }
    }
}