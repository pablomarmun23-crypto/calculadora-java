import java.util.Scanner;
import java.util.ArrayList;
public class GestorTareas {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Hola, soy un gestor de tareas");
        System.out.println("************************");
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        while (true) {
            System.out.println("************************");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("5. Salir");
            System.out.println("************************");
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer
            if (opcion == 1) {
                System.out.println("************************");
                System.out.print("Ingrese la tarea: ");
                String tarea = teclado.nextLine();
                tareas.add(tarea);
                System.out.println("Tarea agregada.");
            } else if (opcion == 2) {
                System.out.println("************************");
                System.out.println("Tareas:");
                for (int i = 0; i < tareas.size(); i++) {
                    System.out.println((i + 1) + ". " + tareas.get(i));
                }
            } else if (opcion == 3) {
                System.out.println("************************");
                System.out.print("Ingrese el número de la tarea a eliminar: ");
                int indice = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer
                if (indice >= 1 && indice <= tareas.size()) {
                    tareas.remove(indice - 1);
                    System.out.println("Tarea eliminada.");
                } else {
                    System.out.println("Índice no válido.");
                }
            } else if (opcion == 4) {
                System.out.println("************************");
                System.out.print("Ingrese el número de la tarea a marcar como completada: ");
                int indice = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer
                if (indice >= 1 && indice <= tareas.size()) {
                    tareas.set(indice - 1, "[X] " + tareas.get(indice - 1));
                    System.out.println("Tarea marcada como completada.");
                } else {
                    System.out.println("Índice no válido.");
                }
            } else if (opcion == 5) {
                System.out.println("Adiós!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
