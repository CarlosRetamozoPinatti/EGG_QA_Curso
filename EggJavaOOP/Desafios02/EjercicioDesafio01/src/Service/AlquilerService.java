package Service;

import Entity.Alquiler;
import Entity.Pelicula;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class AlquilerService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private PeliculaService service;
    private List<Alquiler> alquileres;

    public AlquilerService(PeliculaService service) {
        this.service = service;
        alquileres = new ArrayList<>();
    }

    public void alquilarPelicula() {
        System.out.println("Ingrese el nombre de la pelicula");
        String nombre = leer.nextLine();

        Optional<Pelicula> peliculaEncontrada = service.catalogo.stream()
                .filter(pelicula -> pelicula.getNombre().equalsIgnoreCase(nombre))
                .findFirst();

        if (peliculaEncontrada.isPresent()) {
            Pelicula pelicula = peliculaEncontrada.get();
            System.out.println("PELICULA ENCONTRADA");

            if (pelicula.isDisponible()) {
                System.out.println(pelicula);

                Alquiler alquiler = new Alquiler();
                alquiler.setPelicula(pelicula.getNombre());

                try {
                    System.out.println("Ingrese la fecha de retiro (AAAA-MM-DD): ");
                    LocalDate retiro = LocalDate.parse(leer.nextLine());
                    alquiler.setFechaInicio(retiro);

                    alquiler.setFechaFin(alquiler.getFechaInicio().plus(3, ChronoUnit.DAYS));
                    System.out.println("La fecha de devolucion es: " + alquiler.getFechaFin());

                    System.out.println("Ingrese el precio de alquiler: ");
                    double precio = leer.nextDouble();
                    alquiler.setPrecio(precio);
                    System.out.println("Pasada la fecha de devolución, se le aplicará un recargo del 10% por dia retrasado.");

                    System.out.println("Alquiler creado!");
                    System.out.println(alquiler);

                    pelicula.setDisponible(false);


                    alquileres.add(alquiler);
                } catch (DateTimeParseException e) {
                    System.out.println("Error al analizar la fecha. Asegúrese de ingresar la fecha en el formato correcto (AAAA-MM-DD).");
                }
            } else {
                System.out.println("La pelicula ya fue alquilada");
            }
        } else {
            System.out.println("La pelicula no se encuentra en nuestra base de datos.");
        }
    }

    public void mostrarAlquilados() {
        if (alquileres == null) {
            System.out.println("No hay alquileres aun..");
        } else {
            System.out.println(alquileres);
        }
    }

    public void buscarPorFecha() {
        System.out.println("Ingrese una fecha para iniciar la búsqueda (AAAA-MM-DD): ");
        LocalDate fechaDesde;
        try {
            fechaDesde = LocalDate.parse(leer.nextLine());
        } catch (DateTimeParseException e) {
            System.out.println("Error al analizar la fecha. Asegúrese de ingresar la fecha en el formato correcto (AAAA-MM-DD).");
            return; // Terminar el método si ocurre una excepción al analizar la fecha
        }

        List<Alquiler> alqPorFecha = alquileres.stream()
                .filter(alquiler -> alquiler.getFechaInicio().isAfter(fechaDesde))
                .collect(Collectors.toList());

        if (!alqPorFecha.isEmpty()) {
            System.out.println(alqPorFecha);
        } else {
            System.out.println("No existen alquileres posteriores a esta fecha.");
        }
    }

    public void devolverAlquiler() {
        System.out.println("Ingrese el nombre de la película:");
        String nombre = leer.nextLine().toLowerCase();

        Optional<Alquiler> alquilerEncontrado = alquileres.stream()
                .filter(alquiler -> alquiler.getPelicula().toLowerCase().equals(nombre))
                .findFirst();

        if (alquilerEncontrado.isPresent()) {
            Alquiler alquiler = alquilerEncontrado.get();
            System.out.println("ALQUILER ENCONTRADO");

            LocalDate fechaEntrega;
            try {
                System.out.println("Ingrese la fecha de entrega (AAAA-MM-DD):");
                fechaEntrega = LocalDate.parse(leer.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Error al analizar la fecha. Asegúrese de ingresar la fecha en el formato correcto (AAAA-MM-DD).");
                return; // Terminar el método si ocurre una excepción al analizar la fecha
            }

            alquiler.setFechaFin(fechaEntrega);
            System.out.println("Fecha de entrega registrada: " + alquiler.getFechaFin());

            long diasRetraso = ChronoUnit.DAYS.between(alquiler.getFechaInicio(), alquiler.getFechaFin());

            if (diasRetraso > 3) {
                double recargo = diasRetraso * alquiler.getPrecio() * 0.1;
                double precioTotal = alquiler.getPrecio() + recargo;
                System.out.println("Se aplicó un recargo del 10% por día retrasado.");
                System.out.println("Precio total a pagar: " + precioTotal);
            } else {
                System.out.println("No hay recargo por días de retraso.");
                System.out.println("Precio a pagar: " + alquiler.getPrecio());
            }

            Optional<Pelicula> peliculaEncontrada = service.catalogo.stream()
                    .filter(pelicula -> pelicula.getNombre().toLowerCase().equals(nombre))
                    .findFirst();
            if (peliculaEncontrada.isPresent()) {
                Pelicula pelicula = peliculaEncontrada.get();
                pelicula.setDisponible(true);
                System.out.println("La película se ha marcado como disponible nuevamente.");
            } else {
                System.out.println("No se encontró la película en el catálogo.");
            }
        } else {
            System.out.println("No se encontró un alquiler para la película especificada.");
        }
    }

}