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
public class Controladora_Ctrl {
    private LinkedList<Autorizacion>Aurotizaciones;
    private LinkedList<Benefactor>Benefactores;

    public Controladora_Ctrl(LinkedList<Autorizacion> Aurotizaciones, LinkedList<Benefactor> Benefactores) {
        this.Aurotizaciones = Aurotizaciones;
        this.Benefactores = Benefactores;
    }
    
    public boolean AutoriazarDonacion(String Documento,String NTarjeta,float ValorAPagar,String DatosEstablecimiento){
        return false;
    }
    
    public boolean AgregarAutorizacion(String CuentaDestino, float Valor,String Lugar,String Documento){
        return false;
    }
    
    public LinkedList<Autorizacion> ConsultarDonacionesPendientes(String Documento){
        LinkedList<Autorizacion> Prueba = new LinkedList<>();
        return Prueba;
    }
    
    public boolean EsBenefactor(String Documento){
        return false;
    }
    
    private boolean HacerConsgnacion(Benefactor benefactor,String DatosEstablecimiento,Object Organizacion){
        return false;
    }

    /**
     * @return the Aurotizaciones
     */
    public LinkedList<Autorizacion> getAurotizaciones() {
        return Aurotizaciones;
    }

    /**
     * @param Aurotizaciones the Aurotizaciones to set
     */
    public void setAurotizaciones(LinkedList<Autorizacion> Aurotizaciones) {
        this.Aurotizaciones = Aurotizaciones;
    }

    /**
     * @return the Benefactores
     */
    public LinkedList<Benefactor> getBenefactores() {
        return Benefactores;
    }

    /**
     * @param Benefactores the Benefactores to set
     */
    public void setBenefactores(LinkedList<Benefactor> Benefactores) {
        this.Benefactores = Benefactores;
    }
}
