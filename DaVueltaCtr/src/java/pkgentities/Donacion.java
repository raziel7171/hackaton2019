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
public class Donacion {
    private String Id;
    private String CuentaDestino;
    private float Valor;
    private String Lugar;

    public Donacion(String Id, String CuentaDestino, float Valor, String Lugar) {
        this.Id = Id;
        this.CuentaDestino = CuentaDestino;
        this.Valor = Valor;
        this.Lugar = Lugar;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the CuentaDestino
     */
    public String getCuentaDestino() {
        return CuentaDestino;
    }

    /**
     * @param CuentaDestino the CuentaDestino to set
     */
    public void setCuentaDestino(String CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    /**
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Lugar
     */
    public String getLugar() {
        return Lugar;
    }

    /**
     * @param Lugar the Lugar to set
     */
    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    
}
