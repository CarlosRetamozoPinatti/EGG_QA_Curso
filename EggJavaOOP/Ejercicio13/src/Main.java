import Entity.Curso;
import Service.CursoService;

public class Main {
    public static void main(String[] args) {
        CursoService service = new CursoService();
        Curso curso = service.crearCurso();
        System.out.println("-------------");
        System.out.println(curso.toString());
        System.out.println("-------------");

        System.out.println("El total facturado sera de: " + service.calcularGanancias(curso));
    }
}