package org.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Poliza {
    private int numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Cuota> cuotas;

    public Poliza(int numeroPoliza, Date fechaInicio, Date fechaFin, int cantidadCuotas, String formaPago,
                  double montoTotalAsegurado, boolean incluyeGranizo, double montoMaximoGranizo,
                  String tipoCobertura, Cliente cliente, Vehiculo vehiculo) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuotas = new ArrayList<>();
    }

    public void agregarCuota(Cuota cuota) {
        cuotas.add(cuota);
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
}
