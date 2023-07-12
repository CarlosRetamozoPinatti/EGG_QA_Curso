package Entity;

public class Cliente {
    private static long countId;
    private long id;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private String objetivo;

    public Cliente() {
        this.id = ++countId;
    }

    public Cliente(long id, String nombre, int edad, double peso, double altura, String objetivo) {
        this.id = ++countId;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
               "Nombre: " + nombre + ", Edad: " + edad + "\n" +
               "Peso: " + peso + ", Altura: " + altura + "\n" +
               "Objetivo: " + objetivo + "\n";
    }
}
