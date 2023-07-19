package org.example.entity;

public class ValidadorFechas {
    private static final int MIN_ANIO = 1;
    private static final int MAX_ANIO = 9999;
    private static final int MIN_MES = 1;
    private static final int MAX_MES = 12;
    private static final int MIN_DIA = 1;

    public boolean validarFecha(int anio, int mes, int dia) {
        return esAnioValido(anio) && esMesValido(mes) && esDiaValido(anio, mes, dia);
    }

    private boolean esAnioValido(int anio) {
        return anio >= MIN_ANIO && anio <= MAX_ANIO;
    }

    private boolean esMesValido(int mes) {
        return mes >= MIN_MES && mes <= MAX_MES;
    }

    private boolean esDiaValido(int anio, int mes, int dia) {
        if (dia < MIN_DIA) {
            return false;
        }

        int maxDay = obtenerMaximoDia(anio, mes);
        return dia <= maxDay;
    }

    private int obtenerMaximoDia(int anio, int mes) {
        if (mes == 2) {
            return esBisiesto(anio) ? 29 : 28;
        } else if (mesTiene30Dias(mes)) {
            return 30;
        } else {
            return 31;
        }
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
    }

    private boolean mesTiene30Dias(int mes) {
        return mes == 4 || mes == 6 || mes == 9 || mes == 11;
    }
}