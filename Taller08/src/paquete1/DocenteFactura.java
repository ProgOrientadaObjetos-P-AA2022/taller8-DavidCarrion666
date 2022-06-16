/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIVA;
    private double valorCancelar;

    public void establecerValorFactura(double numero) {
        valorFactura = numero;
    }

    public void establecerValorIVA(double valor) {
        valorIVA = valor;
    }

    public void calcularValorCancelar() {
        valorCancelar = ((valorIVA * valorFactura) / 100) + valorFactura;

    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIVA() {
        return valorIVA;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format( "Nombre: %s\nCedula: %s\nValor De La "
                + "Factura: %.2f\nValor Del Iva: %.2f\nValor A Cancelar: %.2f\n",
                nombreDocente,
                cedulaDocente,
                valorFactura,
                valorIVA,
                valorCancelar);
        return reporte;
    }
}
