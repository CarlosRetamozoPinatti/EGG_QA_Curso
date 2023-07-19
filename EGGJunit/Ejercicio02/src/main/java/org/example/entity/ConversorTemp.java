package org.example.entity;

public class ConversorTemp {
    public double rankineACelsius(double rankine) {
        if (rankine < 0) {
            throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa");
        }
        double celsius = (rankine - 491.67) * 5 / 9;
        return celsius;
    }

    public double rankineAFahrenheit(double rankine) {
        if (rankine < 0) {
            throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa");
        }
        double fahrenheit = rankine - 459.67;
        return fahrenheit;
    }

    public double rankineAKelvin(double rankine) {
        if (rankine < 0) {
            throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa");
        }
        double kelvin = rankine * 5 / 9;
        return kelvin;
    }

    public double celsiusARankine(double celsius) {
        if (celsius <= -273.15) {
            throw new IllegalArgumentException("La temperatura en Celsius no puede ser menor a -273.15");
        }
        double rankine = (celsius * 9 / 5) + 491.67;
        return rankine;
    }

    public double celsiusAFahrenheit(double celsius) {
        if (celsius <= -273.15) {
            throw new IllegalArgumentException("La temperatura en Celsius no puede ser menor a -273.15");
        }
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public double celsiusAKelvin(double celsius) {
        if (celsius <= -273.15) {
            throw new IllegalArgumentException("La temperatura en Celsius no puede ser menor a -273.15");
        }
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public double fahrenheitARankine(double fahrenheit) {
        if (fahrenheit <= -459.67) {
            throw new IllegalArgumentException("La temperatura en Fahrenheit no puede ser menor a -459.67");
        }
        double rankine = fahrenheit + 459.67;
        return rankine;
    }

    public double fahrenheitACelsius(double fahrenheit) {
        if (fahrenheit <= -459.67) {
            throw new IllegalArgumentException("La temperatura en Fahrenheit no puede ser menor a -459.67");
        }
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double fahrenheitAKelvin(double fahrenheit) {
        if (fahrenheit <= -459.67) {
            throw new IllegalArgumentException("La temperatura en Fahrenheit no puede ser menor a -459.67");
        }
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        return kelvin;
    }

    public double kelvinARankine(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa");
        }
        double rankine = kelvin * 9 / 5;
        return rankine;
    }

    public double kelvinACelsius(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa");
        }
        double celsius = kelvin - 273.15;
        return celsius;
    }

    public double kelvinAFahrenheit(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa");
        }
        double fahrenheit = (kelvin * 9 / 5) - 459.67;
        return fahrenheit;
    }
}
