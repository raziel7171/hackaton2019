/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgentities;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Tarjeta {
    private String Nro;
    private Date Fecha_Expedicion;
    private Date Fecha_Vencimiento;
    private String TipoDeCuenta;

    public Tarjeta(String Nro, Date Fecha_Expedicion, Date Fecha_Vencimiento, String TipoDeCuenta) {
        this.Nro = Nro;
        this.Fecha_Expedicion = Fecha_Expedicion;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
        this.TipoDeCuenta = TipoDeCuenta;
    }
   
    public boolean Vencida(){
        return true;
    }

    /**
     * @return the Nro
     */
    public String getNro() {
        return Nro;
    }

    /**
     * @return the Fecha_Expedicion
     */
    public Date getFecha_Expedicion() {
        return Fecha_Expedicion;
    }

    /**
     * @return the Fecha_Vencimiento
     */
    public Date getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    /**
     * @return the TipoDeCuenta
     */
    public String getTipoDeCuenta() {
        return TipoDeCuenta;
    }

    /**
     * @param TipoDeCuenta the TipoDeCuenta to set
     */
    public void setTipoDeCuenta(String TipoDeCuenta) {
        this.TipoDeCuenta = TipoDeCuenta;
    }
    
    
}
