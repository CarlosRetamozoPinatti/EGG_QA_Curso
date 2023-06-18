package Entity;

public class Vehiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String marca, String modelo, int año) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return  "Datos del vehiculo: " + "\n" +
                "Tipo: " + tipo + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + año;
    }
}
