import Entity.Cuenta;
import Service.CuentaService;

public class Main {
    public static void main(String[] args) {
        CuentaService c = new CuentaService();
        Cuenta cuenta = c.crearCuenta();
        c.ejecutarMenu(c);

    }

}
