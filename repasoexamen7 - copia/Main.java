import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CodigosCuenta banco = new CodigosCuenta();

        System.out.println("Ingrese el nombre del titular:");
        String nombreTitular = scanner.nextLine();
        System.out.println("Ingrese el DNI del titular:");
        String dniTitular = scanner.nextLine();
        System.out.println("Ingrese el código completo de la cuenta bancaria (CCC):");
        String codigoCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(nombreTitular, dniTitular, codigoCuenta, saldoInicial);
        banco.agregarCuenta(cuenta);
        System.out.println("Cuenta agregada correctamente.");

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar número completo de cuenta");
            System.out.println("2. Mostrar nombre del titular");
            System.out.println("3. Mostrar código de la entidad bancaria");
            System.out.println("4. Mostrar código de la sucursal");
            System.out.println("5. Mostrar solo el número de la cuenta");
            System.out.println("6. Mostrar los dígitos de control de la cuenta");
            System.out.println("7. Depositar dinero");
            System.out.println("8. Retirar dinero");
            System.out.println("9. Consultar saldo actual");
            System.out.println("10. Cerrar aplicación");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Número completo de cuenta: " + cuenta.getCodigoCuenta());
                    break;
                case 2:
                    System.out.println("Nombre del titular: " + cuenta.getNombreTitular());
                    break;
                case 3:
                    System.out.println("Código de la entidad bancaria: " + cuenta.getCodigoEntidad());
                    break;
                case 4:
                    System.out.println("Código de la sucursal: " + cuenta.getCodigoSucursal());
                    break;
                case 5:
                    System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
                    break;
                case 6:
                    System.out.println("Dígitos de control: " + cuenta.getDigitosControl());
                    break;
                case 7:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    cuenta.depositar(cantidadDeposito);
                    break;
                case 8:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    cuenta.retirar(cantidadRetiro);
                    break;
                case 9:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 10:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 10);

        scanner.close();
    }
}