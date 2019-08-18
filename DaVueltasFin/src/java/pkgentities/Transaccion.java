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
public class Transaccion {
    private Cuenta CuentaOrigen;
    private Cuenta CuentaDestino;
    private float Valor;
    private Date fecha;

    public Transaccion(Cuenta CuentaOrigen, Cuenta CuentaDestino, float Valor, Date fecha) {
        this.CuentaOrigen = CuentaOrigen;
        this.CuentaDestino = CuentaDestino;
        this.Valor = Valor;
        this.fecha = fecha;
    }

    
    
    
}
