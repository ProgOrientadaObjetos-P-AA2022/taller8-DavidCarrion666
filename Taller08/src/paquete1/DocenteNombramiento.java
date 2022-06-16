/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtras;
    private double sueldoTotal;

    public void establecerValorSueldo(double numero) {
        valorSueldo = numero;
    }

    public void establecerValorHorasExtras(double valor) {
        valorHoraExtra = valor;
    }

    public void establecerNumeroHorasExtra(int valor) {
        numeroHorasExtras = valor;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (valorHoraExtra * numeroHorasExtras) + valorSueldo;
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtras() {
        return valorHoraExtra;
    }

    public int obtenerNumeroHorasExtra() {
        return numeroHorasExtras;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\nCedula: %s\nValor Del "
                + "Sueldo: %.2f\nValor De Las Horas Extra: %.2f\nNumero De "
                + "Horas Extra: %d\nSueldo Total: %.2f\n",
                nombreDocente,
                cedulaDocente,
                valorSueldo,
                valorHoraExtra,
                numeroHorasExtras,
                sueldoTotal);
        return reporte;
    }
}
