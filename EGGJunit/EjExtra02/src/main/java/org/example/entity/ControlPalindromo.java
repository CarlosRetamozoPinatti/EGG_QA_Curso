package org.example.entity;

public class ControlPalindromo {
    public boolean esPalindromo(String cadena) {
        // Eliminar espacios en blanco y convertir a minúsculas
        String cadenaFormateada = cadena.replaceAll("\\s+", "").toLowerCase();

        // Comparar la cadena original con su reverso
        String reverso = new StringBuilder(cadenaFormateada).reverse().toString();
        return cadenaFormateada.equals(reverso);
    }
}
