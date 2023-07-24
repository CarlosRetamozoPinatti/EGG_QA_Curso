package entity;

public class CodigoPostal {
    private String codigo;
    private String ciudad;

    public CodigoPostal(String codigo, String ciudad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Código Postal: " + codigo + ", Ciudad: " + ciudad;
    }
}
