import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("********** NATIONAL BANK ***********");
        System.out.println("\nNombre de cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo + "$");
        System.out.println("\n************************************");

        String menu = """
                ********** Selecciona una opción ***********
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo disponible: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double cantidadARetirar = teclado.nextDouble();
                    if (cantidadARetirar > saldo) {
                        System.out.println("No tienes suficiente saldo para retirar esa cantidad.");
                    } else {
                        saldo -= cantidadARetirar;
                        System.out.println("Retiro exitoso. Saldo disponible: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double cantidadADepositar = teclado.nextDouble();
                    saldo += cantidadADepositar;
                    System.out.println("Deposito exitoso. Saldo disponible: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
