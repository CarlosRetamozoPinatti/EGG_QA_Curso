package entity;

import java.util.HashSet;
import java.util.Set;

public class Paises {
    private Set<String> paises;

    public Paises() {
        paises = new HashSet<>();
    }

    public Paises(Set<String> paises) {
        this.paises = paises;
    }

    public Set<String> getPaises() {
        return paises;
    }

    public void setPaises(Set<String> paises) {
        this.paises = paises;
    }
}