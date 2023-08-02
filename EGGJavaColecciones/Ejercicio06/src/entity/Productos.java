package entity;

import java.util.*;

public class Productos {
    private Map<String, Double> productos;

    public Productos() {
        productos = new HashMap<>();
    }

    public Productos(Map<String, Double> productos) {
        this.productos = productos;
    }

    public Map<String, Double> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Productos en la tienda:\n");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            sb.append(entry.getKey()).append(" - Precio: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

