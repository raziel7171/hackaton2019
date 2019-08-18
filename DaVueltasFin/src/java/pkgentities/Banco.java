/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgentities;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author kevin
 */
public class Banco {
    public LinkedList<Cuenta>ListaCuenta;
    public String nombre;
    public String id;
    
   
    public Banco(String nombre, String id ) {
        this.ListaCuenta = new LinkedList<>();;
        this.nombre = nombre;
        this.id = id;
    }
    
   
    
    public boolean Hacer_Transaccion(String CuentaOr,String CuentaDes, float Valor) throws ExceptionBanco {
            boolean flag = false;
            boolean flag2 = false;
            
            for (Cuenta x : ListaCuenta){
                if(x.getNumer_Cuenta().equals(CuentaOr)){
                    x.setSaldo(x.getSaldo()-Valor);
                    flag=true;
                }
                if(x.getNumer_Cuenta().equals(CuentaDes)){
                    x.setSaldo(x.getSaldo()+Valor);
                    flag=true;
                }  
            }
            if(!flag || !flag2){
               throw new ExceptionBanco(111);
            }
            
        return flag;    
    }
    
    
  
}
