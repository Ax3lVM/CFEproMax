package mx.itson.CFEproMax.entidades;

import java.util.Date;
import java.util.List;
import mx.itson.CFEproMax.enumeradores.MetodoPago;
import mx.itson.CFEproMax.enumeradores.Servicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axelt
 */
public class Factura {

    /**
     * @return the fechaEmision
     */
    public Date getFechaEmision() {
        return fechaEmision;
    }

    /**
     * @param fechaEmision the fechaEmision to set
     */
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the numeroFactura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the servicios
     */
    public List<Servicio> getServicios() {
        return servicios;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    /**
     * @return the consumoKw
     */
    public double getConsumoKw() {
        return consumoKw;
    }

    /**
     * @param consumoKw the consumoKw to set
     */
    public void setConsumoKw(double consumoKw) {
        this.consumoKw = consumoKw;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the metodopago
     */
    public MetodoPago getMetodopago() {
        return metodopago;
    }

    /**
     * @param metodopago the metodopago to set
     */
    public void setMetodopago(MetodoPago metodopago) {
        this.metodopago = metodopago;
    }
    
private Date fechaEmision;
private Date fechaVencimiento;
private int numeroFactura;
private List<Servicio> servicios;
private double consumoKw;
private double total;
private MetodoPago metodopago;
}
