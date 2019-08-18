package Clases;

import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Organizacion
{
 private String nit;
 private String nombre;
 private String dirreccion;
 private String email;
 private String razonSocial;
 private CuentaOrganizacion cuenta;
 private LinkedList<String> listaDonaciones;
 
 public boolean registrarDonacion(double valor, String nCuenta){
     
     return false;
 }
 
 public boolean actualizarCuenta(String nCuenta, String tipoCuenta, String titular ){
     
     return false;
 }
}
