import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Obtener la fecha ingresada por el usuario
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la diferencia en años
        int anios = calcularDiferenciaEnAnios(fechaIngresada, fechaActual);

        // Formatear la fecha ingresada para mostrarla correctamente
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaIngresadaFormateada = fechaIngresada.format(formatter);

        // Mostrar la fecha ingresada y la diferencia en años
        System.out.println("Fecha ingresada: " + fechaIngresadaFormateada);
        System.out.println("Diferencia en años: " + anios + " años.");
    }

    public static int calcularDiferenciaEnAnios(LocalDate fecha1, LocalDate fecha2) {
        Period periodo = Period.between(fecha1, fecha2);
        return periodo.getYears();
    }
}
