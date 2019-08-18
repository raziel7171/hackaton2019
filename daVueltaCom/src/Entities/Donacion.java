/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author USUARIO
 */
public class Donacion
{

    private String documentoBenefactor;
    private int valorPagar;
    private String cuentaDestino;
    private String nombre;
    private String direccion;

    Donacion(String documentoBenefactor, int valorPagar, String cuentaDestino)
    {
        this.documentoBenefactor = documentoBenefactor;
        this.valorPagar = valorPagar;
        this.cuentaDestino = cuentaDestino;
    }

    public void completarDatos(String nom, String dir)
    {
        nombre = nom;
        direccion = dir;
    }

    public boolean verificarBenefactor(String documentoBenefactor)
    {
        return esBenefactor(documentoBenefactor);
    }

    private static Boolean esBenefactor(java.lang.String documento)
    {
        Entities.CtrlControl_Service service = new Entities.CtrlControl_Service();
        Entities.CtrlControl port = service.getCtrlControlPort();
        return port.esBenefactor(documento);
    }

    public String getDocumentoBenefactor()
    {
        return documentoBenefactor;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

}
