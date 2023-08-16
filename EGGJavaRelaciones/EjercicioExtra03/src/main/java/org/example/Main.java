package org.example;

import org.example.entity.Cliente;
import org.example.entity.Cuota;
import org.example.entity.Poliza;
import org.example.entity.Vehiculo;

/*
Explicación de las relaciones entre clases:

Cliente y Poliza:

Un cliente puede tener una o varias pólizas.
Cada póliza pertenece a un único cliente.
Vehiculo y Poliza:

Un vehículo puede estar asegurado por una o varias pólizas.
Cada póliza asegura un único vehículo.
Poliza y Cuota:

Una póliza puede tener una o varias cuotas.
Cada cuota pertenece a una única póliza.
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Perez", 123456789, "juan@email.com", "Calle 123", "1234567890");
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2023, "12345", "54321", "Negro", "Sedán");

        Poliza poliza = new Poliza(1, new Date(), new Date(), 12, "Tarjeta", 50000.0, true, 10000.0,
                "Total", cliente, vehiculo);

        poliza.agregarCuota(new Cuota(1, 5000.0, false, new Date(), "Efectivo"));
        poliza.agregarCuota(new Cuota(2, 5000.0, false, new Date(), "Efectivo"));
        poliza.agregarCuota(new Cuota(3, 5000.0, true, new Date(), "Efectivo"));

        System.out.println("Cliente: " + cliente.getNombreCompleto());
        System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());

        for (Cuota cuota : poliza.getCuotas()) {
            String estadoPago = cuota.estaPagada() ? "Pagada" : "No pagada"; // Determinar el estado de pago
            System.out.println("Cuota " + cuota.getNumeroCuota() + ": $" + cuota.getMontoTotalCuota() + " (" + estadoPago + ")");
        }
    }
}
