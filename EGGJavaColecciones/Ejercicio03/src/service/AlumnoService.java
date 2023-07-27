package service;

import entity.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    private List<Alumno> listaAlumnos;

    public AlumnoService() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = leer.nextLine();
            Alumno alumno = new Alumno(nombre);

            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = Integer.parseInt(leer.nextLine());
                alumno.agregarNota(nota);
            }
            listaAlumnos.add(alumno);
            System.out.print("¿Desea crear otro alumno? (s/n): ");
        } while (leer.nextLine().equalsIgnoreCase("s"));
    }

    public void notaFinal() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = leer.nextLine();
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombre().equalsIgnoreCase(nombreAlumno))
                .findFirst()
                .ifPresentOrElse(alumno -> {
                    List<Integer> notas = alumno.getNotas();
                    if (!notas.isEmpty()) {
                        double promedio = notas.stream().mapToInt(Integer::intValue).average().orElse(0);
                        System.out.println("La nota final de " + nombreAlumno + " es: " + promedio);
                    } else {
                        System.out.println("El alumno " + nombreAlumno + " no tiene notas registradas.");
                    }
                }, () -> System.out.println("El alumno " + nombreAlumno + " no está en la lista."));
    }

    public void modificarNota() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombreAlumno = leer.nextLine();
            boolean alumnoEncontrado = false;
            for (Alumno alumno : listaAlumnos) {
                if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                    System.out.print("Ingrese el número de la nota a modificar (1, 2 o 3): ");
                    int numeroNota = Integer.parseInt(leer.nextLine());
                    if (numeroNota >= 1 && numeroNota <= 3) {
                        System.out.print("Ingrese la nueva nota para la nota " + numeroNota + ": ");
                        int nuevaNota = Integer.parseInt(leer.nextLine());
                        List<Integer> notas = alumno.getNotas();
                        notas.set(numeroNota - 1, nuevaNota); // Resto 1 porque los índices comienzan en 0.
                        System.out.println("La nota " + numeroNota + " del alumno " + nombreAlumno + " ha sido modificada.");
                    } else {
                        System.out.println("Número de nota inválido. Debe ser 1, 2 o 3.");
                    }
                    alumnoEncontrado = true;
                    break;
                }
            }
            if (!alumnoEncontrado) {
                System.out.println("El alumno " + nombreAlumno + " no está en la lista.");
            }
            System.out.print("¿Desea modificar otra nota? (s/n): ");
        } while (leer.nextLine().equalsIgnoreCase("s"));
    }

    public void alumnosYNotas() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            System.out.println("Alumnos y sus notas:");
            for (Alumno alumno : listaAlumnos) {
                System.out.println("Nombre: " + alumno.getNombre() + ", Notas: " + alumno.getNotas());
            }
        }
    }

    public void alumnosConNotaFinal() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            System.out.println("Alumnos y sus notas finales:");
            for (Alumno alumno : listaAlumnos) {
                List<Integer> notas = alumno.getNotas();
                if (!notas.isEmpty()) {
                    double promedio = notas.stream().mapToInt(Integer::intValue).average().orElse(0);
                    System.out.println("Nombre: " + alumno.getNombre() + ", Nota Final: " + promedio);
                } else {
                    System.out.println("Nombre: " + alumno.getNombre() + ", Nota Final: Sin notas registradas");
                }
            }
        }
    }
}
