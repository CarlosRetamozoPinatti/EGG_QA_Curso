package service;

import entity.Ciudades;

import java.util.*;

public class CiudadesService {
    private Ciudades ciudades;

    public CiudadesService() {
        ciudades = new Ciudades();
    }

    public void agregarCiudad(String nombreCiudad, Integer codigoPostal) {
        ciudades.getCiudades().put(nombreCiudad, codigoPostal);
        System.out.println("Ciudad agregada: " + nombreCiudad + " - Código postal: " + codigoPostal);
    }

    public void modificarNombreCiudad(String nombreCiudad, String nuevoNombre) {
        if (ciudades.getCiudades().containsKey(nombreCiudad)) {
            Integer codigoPostal = ciudades.getCiudades().get(nombreCiudad);
            ciudades.getCiudades().remove(nombreCiudad);
            ciudades.getCiudades().put(nuevoNombre, codigoPostal);
            System.out.println("Nombre de la ciudad modificado. Nuevo nombre: " + nuevoNombre);
        } else {
            System.out.println("La ciudad no existe en el registro.");
        }
    }

    public void modificarCodigoPostal(String nombreCiudad, Integer nuevoCodigoPostal) {
        if (ciudades.getCiudades().containsKey(nombreCiudad)) {
            ciudades.getCiudades().put(nombreCiudad, nuevoCodigoPostal);
            System.out.println("Código postal actualizado para " + nombreCiudad + ": " + nuevoCodigoPostal);
        } else {
            System.out.println("La ciudad no existe en el registro.");
        }
    }

    public void eliminarCiudad(String nombreCiudad) {
        if (ciudades.getCiudades().containsKey(nombreCiudad)) {
            ciudades.getCiudades().remove(nombreCiudad);
            System.out.println("Ciudad eliminada: " + nombreCiudad);
        } else {
            System.out.println("La ciudad no existe en el registro.");
        }
    }

    public void ordenarYVerPorCiudades() {
        if (ciudades.getCiudades().isEmpty()) {
            System.out.println("No hay ciudades en el registro.");
        } else {
            Map<String, Integer> ciudadesOrdenadas = new TreeMap<>(ciudades.getCiudades());
            System.out.println("Ciudades ordenadas alfabéticamente:");
            for (Map.Entry<String, Integer> entry : ciudadesOrdenadas.entrySet()) {
                System.out.println(entry.getKey() + " - Código postal: " + entry.getValue());
            }
        }
    }

    public void ordenarYVerPorCodigosPostales() {
        if (ciudades.getCiudades().isEmpty()) {
            System.out.println("No hay ciudades en el registro.");
        } else {
            List<Map.Entry<String, Integer>> listaCiudades = new ArrayList<>(ciudades.getCiudades().entrySet());
            listaCiudades.sort(Map.Entry.comparingByValue());

            System.out.println("Ciudades ordenadas por códigos postales:");
            for (Map.Entry<String, Integer> entry : listaCiudades) {
                System.out.println(entry.getKey() + " - Código postal: " + entry.getValue());
            }
        }
    }

    public void ordenarYVerAleatoriamente() {
        if (ciudades.getCiudades().isEmpty()) {
            System.out.println("No hay ciudades en el registro.");
        } else {
            List<Map.Entry<String, Integer>> listaCiudades = new ArrayList<>(ciudades.getCiudades().entrySet());
            Collections.shuffle(listaCiudades);

            System.out.println("Ciudades ordenadas aleatoriamente:");
            for (Map.Entry<String, Integer> entry : listaCiudades) {
                System.out.println(entry.getKey() + " - Código postal: " + entry.getValue());
            }
        }
    }
}
