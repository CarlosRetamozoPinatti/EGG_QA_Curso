package Service;

import Entity.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);
    Date fechaActual = new Date();

    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido: ");
        p.setApellido(leer.nextLine());
        System.out.println("Seteando fecha de nacimiento: ");
        System.out.println("Ingrese el dia (numero del calendario): ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes (numero del caledanrio): ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año (formato AAAAen numero): ");
        int anio = leer.nextInt();
        Date fchNac = new Date(anio - 1900, mes - 1, dia);
        p.setFechaNac(fchNac);

        return p;
    }

    public void calcularEdad(Persona p) {
        System.out.printf("La persona tiene %d años. \n", fechaActual.getYear() - p.getFechaNac().getYear());
    }

    public boolean menorQue(Persona p1, int edad) {
        int edadActual = fechaActual.getYear() - p1.getFechaNac().getYear();
        return edadActual < edad;
    }

}
