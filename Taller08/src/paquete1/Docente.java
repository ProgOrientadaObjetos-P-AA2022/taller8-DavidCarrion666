/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    // # nombresEstudiante: Cadena
    protected String nombreDocente;

    protected String cedulaDocente;

    public void establecerNombreDocente(String nom) {
        nombreDocente = nom;
    }

       public void establecerCedulaDocente(String ced) {
        cedulaDocente = ced;
    }


    public String obtenerNombreDocente() {
        return nombreDocente;
    }

    public String obtenerCedulaDocente() {
        return cedulaDocente;
    }

}
