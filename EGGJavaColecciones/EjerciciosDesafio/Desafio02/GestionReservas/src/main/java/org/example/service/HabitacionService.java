package org.example.service;

import org.example.entity.Habitacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HabitacionService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Habitacion> habitaciones;

    public HabitacionService(){
        habitaciones = new ArrayList<>();
    }

    public void crearHabitacion(){
        System.out.println("Ingrese el numero de la Habitacion: ");
        int num = Integer.parseInt(leer.next().trim());
        if (buscarHabitacionPorNumero(num) != null) {
            System.out.println("Ya existe una habitacion con el mismo numero en la lista.");
            return;
        }
        System.out.println("Ingrese la capacidad maxima de la habitacion: ");
        int capMax = Integer.parseInt(leer.next().trim());
        Habitacion habitacion = new Habitacion(num, capMax);
        habitaciones.add(habitacion);
        System.out.println("Habitacion agregada correctamente!!");
    }

    private Habitacion buscarHabitacionPorNumero(int num){
        List<Habitacion> habNum = habitaciones.stream()
                .filter(habitacion -> habitacion.getNumeroHabitacion() == num)
                .toList();
        if (!habNum.isEmpty()){
            return habNum.get(0);
        } else {
            return null;
        }
    }

    public void modificarHabitacion(){
        System.out.println("Ingrese el numero de habitacion a modificar: ");
        int num = Integer.parseInt(leer.next().trim());
        Habitacion habMod = buscarHabitacionPorNumero(num);
        if (habMod == null){
            System.out.println("No existe el numero de Habitacion..");
            return;
        }
        System.out.println("Ingrese la nueva capacidad de la habitacion: ");
        int capMax = Integer.parseInt(leer.next().trim());
        habMod.setCapacidadMax(capMax);
        System.out.println("Modificacion exitosa!!..");
    }

    public void verHabitaciones(){
        if (habitaciones.isEmpty()){
            System.out.println("---------------------");
            System.out.println("Todavia no se registraron personas.");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            System.out.println(habitaciones);
            System.out.println("---------------------");
        }
    }

    public void eliminarHabitaciones(){
        System.out.println("Ingrese el Numero de habitacion que desea eliminar: ");
        int num = Integer.parseInt(leer.next().trim());
        Habitacion habElim = buscarHabitacionPorNumero(num);
        if (habElim == null) {
            System.out.println("No se encontró ninguna habitacion con el numero ingresado.");
            return;
        }
        habitaciones.remove(habElim);
        System.out.println("La habitacion ha sido eliminada de la lista.");
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
