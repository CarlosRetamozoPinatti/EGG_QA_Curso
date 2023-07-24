package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AlumnoService serv = new AlumnoService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Cargar alumno y definir notas.
                2 - Calcular nota final de alumno.
                3 - Mostrar alumnos y sus notas.
                4 - Mostrar alumnos y su nota final.
                5 - Modificar notas en un alumno.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
     do {
        mostrarOpciones();
        opcion = leer.nextInt();
        switch (opcion){
            case 1 -> serv.crearAlumnos();
            case 2 -> serv.notaFinal();
            case 3 -> serv.alumnosYNotas();
            case 4 -> serv.alumnosConNotaFinal();
            case 5 -> serv.modificarNota();
            case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}

