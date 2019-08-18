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
public class ControladorBanco {

    private LinkedList<Banco> Bancos;

    public ControladorBanco() {
        Bancos = new LinkedList<>();
    }

    public void Add(Banco banco) {
        Bancos.add(banco);
    }

    public LinkedList<Banco> getBancos() {
        return Bancos;
    }

    public String deDondeEsMiCuenta(String nroCuenta) {
        String retornar = "";
        for (Banco Banco1 : Bancos) {
            for (Cuenta c : Banco1.ListaCuenta) {
                if (c.getNumer_Cuenta().equals(nroCuenta)) {
                    retornar=Banco1.id;
                }
            }
        }
        return retornar;
    }
}
