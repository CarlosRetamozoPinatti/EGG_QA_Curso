package Entity;

public class Figura {
    private double valor1;
    private double valor2;
    private double valor3;

    public Figura() {
    }

    public Figura(double valor1, double valor2, double valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }
}
