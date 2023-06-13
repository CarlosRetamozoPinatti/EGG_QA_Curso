package Entity;

//Primero, armo la CLASE, que me va a servir para despues generar los OBJETOS. En este caso, Libro.
public class Libro {
    private int ISBN;
    private int paginas;
    private String titulo;
    private String autor;
    private String genero;

    //Luego, armo los constructores. Son las distintas formas de armar un OBJETO.
    //Creo 2. Uno vacío, que funciona como default, y nos permite crear una clase new Libro() sin parámetros declarados.
    //Y uno con todos los parámetros que voy a usar como atributos para los OBJETOS que se creen a partir del mismo.
    public Libro() {
    }
    public Libro(int ISBN, int paginas, String titulo, String autor, String genero) {
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    //Luego, creo los Getters y Setters.
    //Como la CLASE es privada, no podemos modificar directamente sus atributos/parámetros, se lo hace mediante Getters y Setters.

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /* DATO DE VITAL IMPORTANCIA

    Existe un metodo por defecto que se llama ToString()
    El mismo transforma el objeto creado en un string con un formato que nosotros le podemos dar.
    Aca no vamos a usar eso para poder reemplazarlo por un metodo creado por nosotros.
    Asi podemos visualizar bien como se usan los getters y setters.

    FIN DEL DATO DE VITAL IMPORTANCIA*/
}
