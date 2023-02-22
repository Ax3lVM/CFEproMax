package mx.itson.CFEproMax.entidades;

import java.util.List;

/**
 *
 * @author gabri
 */
public class Cuenta {

    /**
     * @return the numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the saldoCuenta
     */
    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    /**
     * @param saldoCuenta the saldoCuenta to set
     */
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    /**
     * @return the medidores
     */
    public List<Medidor> getMedidores() {
        return medidores;
    }

    /**
     * @param medidores the medidores to set
     */
    public void setMedidores(List<Medidor> medidores) {
        this.medidores = medidores;
    }

    /**
     * @return the historialFacturas
     */
    public List<Factura> getHistorialFacturas() {
        return historialFacturas;
    }

    /**
     * @param historialFacturas the historialFacturas to set
     */
    public void setHistorialFacturas(List<Factura> historialFacturas) {
        this.historialFacturas = historialFacturas;
    }
    

private int numeroCuenta;
private Cliente cliente;
private double saldoCuenta;
private List<Medidor> medidores;
private List<Factura> historialFacturas;




}
