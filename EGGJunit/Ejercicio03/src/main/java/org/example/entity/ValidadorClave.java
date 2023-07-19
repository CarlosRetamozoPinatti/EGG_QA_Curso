package org.example.entity;

public class ValidadorClave {
    public boolean validarFortaleza(String clave) {
        return tieneLongitudMinima(clave) &&
                tieneCaracterEspecial(clave) &&
                tieneLetraMayuscula(clave) &&
                tieneNumero(clave);
    }

    private boolean tieneLongitudMinima(String clave) {
        final int LONGITUD_MINIMA = 8;
        return clave.length() >= LONGITUD_MINIMA;
    }

    private boolean tieneCaracterEspecial(String clave) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[{]};:',.<>/?";
        for (char c : clave.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    private boolean tieneLetraMayuscula(String clave) {
        for (char c : clave.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean tieneNumero(String clave) {
        for (char c : clave.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}