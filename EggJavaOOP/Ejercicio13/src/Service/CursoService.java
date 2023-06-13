package Service;

import Entity.Curso;

import java.math.BigDecimal;
import java.util.Scanner;

public class CursoService {
    Scanner leer = new Scanner(System.in);

    public String[] cargarAlumno() {
        String[] alumnos = new String[5];
        System.out.println("Ingrese los nombres de los alumnos del curso: ");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public String turnoCurso() {
        int opcion;
        do {
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Mañana");
                    return "Mañana";
                }
                case 2 -> {
                    System.out.println("Tarde");
                    return "Tarde";
                }
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (true);
    }


    public Curso crearCurso(){
        Curso curso = new Curso();

        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia dedicadas: ");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana dedicados: ");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno del curso (Mañana o Tarde): ");
        curso.setTurno(turnoCurso());
        System.out.println("Ingrese el precio a cobrar: ");
        curso.setPrecio(leer.nextBigDecimal());
        curso.setAlumnos(cargarAlumno());

        return curso;
    }

    public BigDecimal calcularGanancias(Curso curso) {
        int cantidadHorasPorDia = curso.getCantidadHorasPorDia();
        int cantidadDiasPorSemana = curso.getCantidadDiasPorSemana();
        int cantidadAlumnos = curso.getAlumnos().length;
        BigDecimal precioPorHora = curso.getPrecio();

        return BigDecimal.valueOf(cantidadHorasPorDia)
                .multiply(BigDecimal.valueOf(cantidadDiasPorSemana))
                .multiply(BigDecimal.valueOf(cantidadAlumnos))
                .multiply(precioPorHora);
    }
}
