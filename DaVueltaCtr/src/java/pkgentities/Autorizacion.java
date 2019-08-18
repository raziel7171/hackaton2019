/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgentities;

/**
 *
 * @author kevin
 */
public class Autorizacion {
    private boolean Autorizada;
    private String NrTarjeta;
    private float ValorAPagar;
    private String DatosEstablecimiento;

    public Autorizacion(boolean Autorizada, String NrTarjeta, float ValorAPagar, String DatosEstablecimiento) {
        this.Autorizada = Autorizada;
        this.NrTarjeta = NrTarjeta;
        this.ValorAPagar = ValorAPagar;
        this.DatosEstablecimiento = DatosEstablecimiento;
    }

    /**
     * @return the Autorizada
     */
    public boolean isAutorizada() {
        return Autorizada;
    }

    /**
     * @param Autorizada the Autorizada to set
     */
    public void setAutorizada(boolean Autorizada) {
        this.Autorizada = Autorizada;
    }

    /**
     * @return the NrTarjeta
     */
    public String getNrTarjeta() {
        return NrTarjeta;
    }

    /**
     * @param NrTarjeta the NrTarjeta to set
     */
    public void setNrTarjeta(String NrTarjeta) {
        this.NrTarjeta = NrTarjeta;
    }

    /**
     * @return the ValorAPagar
     */
    public float getValorAPagar() {
        return ValorAPagar;
    }

    /**
     * @param ValorAPagar the ValorAPagar to set
     */
    public void setValorAPagar(float ValorAPagar) {
        this.ValorAPagar = ValorAPagar;
    }

    /**
     * @return the DatosEstablecimiento
     */
    public String getDatosEstablecimiento() {
        return DatosEstablecimiento;
    }

    /**
     * @param DatosEstablecimiento the DatosEstablecimiento to set
     */
    public void setDatosEstablecimiento(String DatosEstablecimiento) {
        this.DatosEstablecimiento = DatosEstablecimiento;
    }
    
    
    
}
