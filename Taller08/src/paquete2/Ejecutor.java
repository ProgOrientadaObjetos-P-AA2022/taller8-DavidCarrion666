/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteNombramiento;
import paquete1.DocenteFactura;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion;

        System.out.println("A continuacion se va a elegir un tipo de Docente");
        System.out.println("Ingrese 1 para crear un Docente Nombramiento o , "
                + "Ingrese 2 para crear un Docente Factura");
        opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1 || opcion == 2) {

            System.out.println("Ingrese el nombre Del Docente");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la cedula Del Docente");
            String cedula = sc.nextLine();
            System.out.println("---------------------------------------------");

            switch (opcion) {
                case 1:
                    DocenteNombramiento(nombre, cedula);
                    break;
                case 2:
                    DocenteFactura(nombre, cedula);
                    break;
            }
        } else {
            System.out.println("Error, opción no válida.");
        }
    }

    public static void DocenteNombramiento(String nombre, String cedula){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DocenteNombramiento docente = new DocenteNombramiento();

        System.out.println("Ingrese el valor del sueldo");
        double valorSueldo = sc.nextDouble();
        System.out.println("Ingrese el valor de las horas extra");
        double valorHorasExtra = sc.nextDouble();
        System.out.println("Ingrese el numero de horas extra");
        int numeroHoras = sc.nextInt();
        
        docente.establecerNombreDocente(nombre);
        docente.establecerCedulaDocente(cedula);
        docente.establecerValorSueldo(valorSueldo);
        docente.establecerValorHorasExtras(valorHorasExtra);
        docente.establecerNumeroHorasExtra(numeroHoras);
        docente.calcularSueldoTotal();
        
        

        System.out.println("--------------------------------------------------");
        System.out.printf("%s\n", docente);
    }

    public static void DocenteFactura(String nombre, String cedula) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DocenteFactura docente = new DocenteFactura();

        System.out.println("Ingrese el Valor de la Factura");
        double valorFactura = sc.nextDouble();
        System.out.println("Ingrese el Valor del Iva");
        double valorIva = sc.nextDouble();
        
        docente.establecerNombreDocente(nombre);
        docente.establecerCedulaDocente(cedula);
        docente.establecerValorFactura(valorFactura);
        docente.establecerValorIVA(valorIva);
        docente.calcularValorCancelar();
        

        System.out.println("--------------------------------------------------");
        System.out.printf("%s\n", docente);

    }
}
