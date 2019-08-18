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
public class Cuenta {
    private String Numer_Cuenta;
    private float Saldo;
    private String Titular;
    private boolean EsOrganizacion;
    private String Ntarjeta;
    private LinkedList<Transaccion> Transacciones;

    public Cuenta() {
    }

    /**
     * @return the Numer_Cuenta
     */
    public String getNumer_Cuenta() {
        return Numer_Cuenta;
    }

    /**
     * @return the Saldo
     */
    public float getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the Titular
     */
    public String getTitular() {
        return Titular;
    }

    /**
     * @return the EsOrganizacion
     */
    public boolean isEsOrganizacion() {
        return EsOrganizacion;
    }

    /**
     * @param EsOrganizacion the EsOrganizacion to set
     */
    public void setEsOrganizacion(boolean EsOrganizacion) {
        this.EsOrganizacion = EsOrganizacion;
    }

    /**
     * @return the Ntarjeta
     */
    public String getNtarjeta() {
        return Ntarjeta;
    }

    /**
     * @param Ntarjeta the Ntarjeta to set
     */
    public void setNtarjeta(String Ntarjeta) {
        this.Ntarjeta = Ntarjeta;
    }

    /**
     * @return the Transacciones
     */
    public LinkedList<Transaccion> getTransacciones() {
        return Transacciones;
    }

    /**
     * @param Transacciones the Transacciones to set
     */
    public void setTransacciones(LinkedList<Transaccion> Transacciones) {
        this.Transacciones = Transacciones;
    }
    
    
    
}
