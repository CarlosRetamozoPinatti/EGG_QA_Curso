package org.example.entity;

import java.util.Date;

public class Cuota {
    private int numeroCuota;
    private double montoTotalCuota;
    private boolean pagada;  // Nuevo atributo para indicar el estado de pago
    private Date fechaVencimiento;
    private String formaPago;

    public Cuota(int numeroCuota, double montoTotalCuota, boolean pagada, Date fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public boolean estaPagada() {
        return pagada;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
}
