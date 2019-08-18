/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class Establecimiento
{

    private Donacion donacion;
    private String nombre;
    private String documentoBenefactor;
    private String direccion;
    private int telefono;
    private LinkedList<Donacion> donaciones;

    public boolean solicitarDonacion(Donacion donacion)
    {
        for (Donacion dona : donaciones)
        {
            if(donacion == dona){
                return true;
            }
        }
        return false;
    }

    public boolean agregarDonacion()
    {
        donacion.completarDatos(nombre, direccion);
        
        if (donacion.verificarBenefactor(donacion.getDocumentoBenefactor()))
        {
            donaciones.add(donacion);
            return true;
        }
        return false;
    }
    
}
