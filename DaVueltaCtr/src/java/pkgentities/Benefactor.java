/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgentities;

import java.util.LinkedList;

/**
 *
 * @author kevin
 */
public class Benefactor {
    private String Documento;
    private String Nombre;
    private String Apellido;
    private boolean Redondea1000;
    private String CorreoElectronico;
    private LinkedList<Donacion>Donaciones;

    public Benefactor(String Documento, String Nombre, String Apellido, boolean Redondea1000, String CorreoElectronico, LinkedList<Donacion> Donaciones) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Redondea1000 = Redondea1000;
        this.CorreoElectronico = CorreoElectronico;
        this.Donaciones = Donaciones;
    }

    /**
     * @return the Documento
     */
    public String getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
     */
    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Redondea1000
     */
    public boolean isRedondea1000() {
        return Redondea1000;
    }

    /**
     * @param Redondea1000 the Redondea1000 to set
     */
    public void setRedondea1000(boolean Redondea1000) {
        this.Redondea1000 = Redondea1000;
    }

    /**
     * @return the CorreoElectronico
     */
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    /**
     * @param CorreoElectronico the CorreoElectronico to set
     */
    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    /**
     * @return the Donaciones
     */
    public LinkedList<Donacion> getDonaciones() {
        return Donaciones;
    }

    /**
     * @param Donaciones the Donaciones to set
     */
    public void setDonaciones(LinkedList<Donacion> Donaciones) {
        this.Donaciones = Donaciones;
    }
    
}
