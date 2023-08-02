package entity;

import java.util.HashMap;
import java.util.Map;

public class Ciudades {
    private Map<String, Integer> ciudades;

    public Ciudades() {
        ciudades = new HashMap<>();
    }

    public Ciudades(Map<String, Integer> ciudades) {
        this.ciudades = ciudades;
    }

    public Map<String, Integer> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Map<String, Integer> ciudades) {
        this.ciudades = ciudades;
    }
}
