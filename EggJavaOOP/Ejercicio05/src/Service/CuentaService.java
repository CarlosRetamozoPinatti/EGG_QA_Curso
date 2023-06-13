package Service;

import Entity.Cuenta;

import java.util.Scanner;

public class CuentaService {
    Scanner leer = new Scanner(System.in);
    Cuenta cuenta = new Cuenta();

    public Cuenta crearCuenta() {
        System.out.println("Ingresar el numero de cuenta: ");
        cuenta.setNroCuenta(leer.nextBigInteger());
        System.out.println("Ingrese su numero de DNI: ");
        cuenta.setDNI(leer.nextBigInteger());
        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(leer.nextDouble());

        return cuenta;
    }

    public void masPlata(double ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        System.out.println("Usted ha acreditado " + ingreso);
        System.out.println("Su saldo actual es de: " + cuenta.getSaldoActual());
    }

    public void menosPlata(double retiro) {
        if (retiro < cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Usted a retirado " + retiro);
            System.out.println("Su saldo actual es de: " + cuenta.getSaldoActual());
        } else {
            System.out.println("Saldo insuficiente para realizar la transacción");
        }
    }

    public void plataRapida(double retiro){
        if (retiro <= (cuenta.getSaldoActual() * 0.2)){
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Retiro rapido exitoso");
            System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
        }
        else {
            System.out.println("No se puede realizar una extracción rapida");
            System.out.println(retiro + " es mayor al 20% de saldo actual en su cuenta");
        }
    }

    public String consultarSaldo(){
        return "Su saldo actual es " + cuenta.getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println("---Datos Personales---");
        System.out.println("Numero de cuenta: " + cuenta.getNroCuenta());
        System.out.println("Dni: " + cuenta.getDNI());
        System.out.println("Saldo actual es " + cuenta.getSaldoActual());
    }

    public void ejecutarMenu(CuentaService cuenta) {

        int opcion;

        System.out.println("""
                    1.Consultar el saldo en la cuenta\s
                    2.Depositar dinero
                    3.Retirar dinero
                    4.Extracción rápida
                    5.Consultar Datos
                    6.Salir""");
        System.out.println("Ingrese una opción");

        do {

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> System.out.println(cuenta.consultarSaldo());
                case 2 -> {
                    System.out.println("Ingrese una cantidad de dinero a ingresar");
                    cuenta.masPlata(leer.nextDouble());
                }
                case 3 -> {
                    System.out.println("Ingrese una cantidad a retirar de dinero");
                    cuenta.menosPlata(leer.nextDouble());
                }
                case 4 -> {
                    System.out.println("Ingrese la cantidad de dinero a retirar");
                    cuenta.plataRapida(leer.nextDouble());
                }
                case 5 -> cuenta.consultarDatos();
                default -> System.out.println("Ingrese una opción correcta");
                case 6 -> System.out.println("Adios!");
            }
        } while (opcion != 6);
    }
}
