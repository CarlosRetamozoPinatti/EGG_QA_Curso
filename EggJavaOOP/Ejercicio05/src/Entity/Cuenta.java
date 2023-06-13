package Entity;

import java.math.BigInteger;

public class Cuenta {
    private BigInteger nroCuenta;
    private BigInteger DNI;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(BigInteger nroCuenta, BigInteger DNI, double saldoActual) {
        this.nroCuenta = nroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public BigInteger getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(BigInteger nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public BigInteger getDNI() {
        return DNI;
    }

    public void setDNI(BigInteger DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}
