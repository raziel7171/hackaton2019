/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgentities;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kevin
 */
@WebService(serviceName = "hacerTransaccion")
public class hacerTransaccion {
    private ControladorBanco ctrl;
    private Banco ban;

    public hacerTransaccion() {
        ctrl = new ControladorBanco();
        ban = new Banco("Banco su mama", "123");
        ctrl.Add(ban);
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "consignar")
    public Boolean consignar(@WebParam(name = "cuentaOrigen") String cuentaOrigen, @WebParam(name = "cuentaDestino") String cuentaDestino, @WebParam(name = "valor") float valor) throws ExceptionBanco {
        String x = ctrl.deDondeEsMiCuenta(cuentaOrigen);
        String y = ctrl.deDondeEsMiCuenta(cuentaDestino);
        boolean flag=false,flag2 = false;
        for (Banco b : ctrl.getBancos()) {
            if (b.id==x) {
                flag=b.Hacer_Transaccion(cuentaOrigen, cuentaDestino, valor);
            }
            else if(b.id==y){
                flag2=b.Hacer_Transaccion(cuentaOrigen, cuentaDestino, valor);
            }
        }
        return flag&&flag2;
        
        
    }
}
