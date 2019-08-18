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
    private LinkedList<Banco>Bancos;

    public ControladorBanco() {
    }
    
    public void Add(Banco banco){
        Bancos.add(banco);
    }
}
