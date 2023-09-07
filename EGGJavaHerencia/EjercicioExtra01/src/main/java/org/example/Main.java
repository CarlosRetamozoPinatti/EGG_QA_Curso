package org.example;

import org.example.entity.*;
import org.example.interfaces.Alquiler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Barco velero = new Velero("V123", 10.5, 2020, 2);
        Barco motor = new BarcoMotor("M456", 12.0, 2019, 300);
        Barco yate = new YateLujo("Y789", 15.0, 2021, 500, 5);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date fechaAlquilerVelero = dateFormat.parse("01-09-2023");
        Date fechaDevolucionVelero = dateFormat.parse("10-09-2023");
        Alquiler alquilerVelero = new AlquilerBarco("Juan", "12345", fechaAlquilerVelero, fechaDevolucionVelero, 1, velero);

        Date fechaAlquilerMotor = dateFormat.parse("05-09-2023");
        Date fechaDevolucionMotor = dateFormat.parse("15-09-2023");
        Alquiler alquilerMotor = new AlquilerBarco("Maria", "67890", fechaAlquilerMotor, fechaDevolucionMotor, 2, motor);

        Date fechaAlquilerYate = dateFormat.parse("10-09-2023");
        Date fechaDevolucionYate = dateFormat.parse("20-09-2023");
        Alquiler alquilerYate = new AlquilerBarco("Carlos", "54321", fechaAlquilerYate, fechaDevolucionYate, 3, yate);

        System.out.println("Precio alquiler Velero: $" + alquilerVelero.calcularPrecio());
        System.out.println("Precio alquiler Barco a Motor: $" + alquilerMotor.calcularPrecio());
        System.out.println("Precio alquiler Yate de Lujo: $" + alquilerYate.calcularPrecio());
    }
}