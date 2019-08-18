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

    Donacion(String documentoBenefactor)
    {
        this.documentoBenefactor = documentoBenefactor;
    }
    
    public void completarDatos(int valorPagar, String cuentaDestino){
        
    }
    
    public boolean verificarBenefactor(String documentoBenefactor){
        
        return esBenefactor(documentoBenefactor);
    }

    private static Boolean esBenefactor(java.lang.String documento) {
        Entities.CtrlControl_Service service = new Entities.CtrlControl_Service();
        Entities.CtrlControl port = service.getCtrlControlPort();
        return port.esBenefactor(documento);
    }

}