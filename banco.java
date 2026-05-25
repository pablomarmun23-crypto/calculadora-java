public class banco {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Bienvenido al banco");
        System.out.println("************************");
        System.out.print("Ingrese su nombre: ");
        String nombre = System.console().readLine();
        System.out.println("************************");
        //crear menu para depositar, retirar, consultar saldo y salir
        System.out.println("Hola " + nombre + ", ¿qué desea hacer?");
            System.out.println("************************");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.println("************************");
            int opcion = Integer.parseInt(System.console().readLine());
            double saldo = 0;  
            while (opcion != 4) {
                switch (opcion) {
                    case 1:
                    System.out.println("************************");    
                    System.out.println("Ingrese la cantidad a depositar:");
                        double deposito = Double.parseDouble(System.console().readLine());
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Su nuevo saldo es: " + saldo + " $");
                        break;
                    case 2:
                        System.out.println("************************");
                        System.out.println("Ingrese la cantidad a retirar:");
                        double retiro = Double.parseDouble(System.console().readLine());
                        if (retiro > saldo) {
                            System.out.println("Fondos insuficientes. Su saldo actual es: " + saldo + " $");
                        } else {
                            saldo -= retiro;
                            System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo + " $");
                        }
                        break;
                    case 3:
                        System.out.println("************************");
                        System.out.println("Su saldo actual es: " + saldo + " $");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
                System.out.println("************************");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Salir");
                System.out.println("************************");
                opcion = Integer.parseInt(System.console().readLine());
            }

    }
}
